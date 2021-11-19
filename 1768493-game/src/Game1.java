import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {
        String userGuess;
        String correctGuess;

        boolean notCorrect = true;

        char[] alphabet = { 'A', 'B', 'C', 'D' };

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[(int) (Math.random() * 4)]);
        }

        correctGuess = sb.toString();

        Scanner input = new Scanner(System.in);

        while(notCorrect) {
            System.out.printf("%nEnter your guess: ");
            userGuess = input.nextLine();
            if (userGuess.toUpperCase().equals(correctGuess)) {
                System.out.println("Congratulations " + correctGuess + "is the correct guess !");
                notCorrect = false;
            } else {
                for(int i = 0; i < correctGuess.length(); i++) {
                    if (userGuess.toUpperCase().charAt(i) == correctGuess.charAt(i)) {
                        System.out.print("=");
                    } else if (userGuess.toUpperCase().charAt(i) > correctGuess.charAt(i)){
                        System.out.print(">");
                    } else if (userGuess.toUpperCase().charAt(i) < correctGuess.charAt(i)){
                        System.out.print("<");
                    }
                }
            }

        }
    }

}
