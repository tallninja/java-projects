import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class BingoController {

    private final String[] mainMenuChoices = {"Exit",
            "Play bingo",
            "Set number separator",
            "Create a bingo card",
            "List existing cards",
            "Set bingo card size"};

    private final String EXIT = "Exit";
    private final String PLAY = "PLay Bingo";
    private final String SEPARATOR = "Set number separator";
    private final String CREATE_CARD = "Create a bingo card";
    private final String LIST_CARDS = "List existing cards";
    private final String CARD_SIZE = "Set bingo card size";

    private int rowSize;
    private int columnSize;
    ArrayList<BingoCard> cards = new ArrayList<BingoCard>();

    public BingoController(int i) {

    }

    public int getRowSize() {
        return this.rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColumnSize() {
        return this.columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public void addCard(BingoCard card) {
        this.cards.add(card);
    }


    public void setCardSize() {
        setRowSize(parseInt(Toolkit.getInputForMessage(
                "")));
        setColumnSize(parseInt(Toolkit.getInputForMessage(
                "")));
        System.out.printf("The bingo card size is set to %d rows X %d columns%n",
                getRowSize(),
                getColumnSize());
    }


    public void createNewCard() {
        int totalNumbersRequired = this.rowSize * this.columnSize;
        String[] cardNumbers;
        boolean correctAmountOfNumbersEntered = false;

        do {
            cardNumbers = Toolkit.getInputForMessage(
                    String.format(
                            "Enter %d numbers for your card (separated by " +
                                    "'%s')",
                            totalNumbersRequired,
                            Defaults.getNumberSeparator()))
                    .trim()
                    .split(Defaults.getNumberSeparator());

            if (cardNumbers.length == totalNumbersRequired)
                correctAmountOfNumbersEntered = true; //changes according to calculation inserted here

        } while (!correctAmountOfNumbersEntered);
        System.out.println(Toolkit.printArray(numbers)); //insert code here


        BingoCard newCard = new BingoCard(this.rowSize, this.columnSize);
        newCard.setCardNumbers(cardNumbers);
        this.addCard(newCard);
    }


    public void listBingoCards() {

        for(int i=0; i<this.cards.size(); i++) {
            System.out.println("Card " +i + " numbers:");
            String new_string = this.cards.get(i).getCardNumbers();
            printCardGrid(new_string);
        }
    }

    public void printCardGrid(String numbers) {
        System.out.println(numbers);
    }


    public void setSeparator() {
        String separator = Toolkit.getInputForMessage("Enter the new separator");
        Defaults.setNumberSeparator(separator);
    }


    public void resetAllCardsMarkings() {
        for(BingoCard i: bingoCards)
            i.resetMarked();
    }


    public void markCardNumbers(int number) {
        for(BingoCard i: bingoCards)
            i.markNumber(number);
    }


    public int getWinner() {
        for(int i = 0; i < this.cards.size(); i++) {
            if (cards.get(i).isWinner() == true)
                return i;
        }
        return -1;
    }


    public void play() {
        System.out.println("Eyes down, look in!");
        resetAllCardsMarkings();

        boolean weHaveAWinner;
        do {
            markCardNumbers(parseInt(
                    Toolkit.getInputForMessage("Enter the next number")
                            .trim()));

            int winnerID = getWinner();
            weHaveAWinner = winnerID != Defaults.NO_WINNER;
            if (weHaveAWinner)
                System.out.printf("And the winner is card %d%n", winnerID);
        } while (!weHaveAWinner);
    }

    public String getMenu(String[] menuNumber) {
        StringBuilder menuChoices = new StringBuilder();

        //insert code here
        menuChoices.append(menuNumber[0] + "\n");
        menuChoices.append(menuNumber[1] + "\n");
        menuChoices.append(menuNumber[2] + "\n");
        menuChoices.append(menuNumber[3] + "\n");
        menuChoices.append(menuNumber[4] + "\n");
        menuChoices.append(menuNumber[5] + "\n");

        return String.valueOf(menuChoices);
    }


    public void run() {
        boolean completed = false;
        do {
            switch (Toolkit.getInputForMessage(getMenu(this.mainMenuChoices))) {
                case "0":
                    completed = true;
                    System.out.println(Toolkit.GOODBYEMESSAGE);
                    break;
                case "1":
                    play();
                    break;
                case "2":
                    setSeparator();
                    break;
                case "3":
                    createNewCard();
                    break;
                case "4":
                    listBingoCards();
                    break;
                case "5":
                    setCardSize();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (!completed);
    }
}
