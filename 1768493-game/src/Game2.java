import java.util.Scanner;

public class Game2 {

    public static void main(String[] args) {
        String computerGuess;
        String correctGuess;
        String userHint;

        boolean notCorrect = true;

        char[] alphabet = { 'A', 'B', 'C', 'D' };

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[(int) (Math.random() * 4)]);
        }

        computerGuess = sb.toString();

        Scanner input = new Scanner(System.in);
        System.out.printf("%nEnter the correct guess: ");
        correctGuess = input.nextLine();

        while(notCorrect) {
            System.out.printf("%nHere's my guess: ");
            System.out.println(computerGuess);
            System.out.printf("%nGive me a hint: ");
            userHint = input.nextLine();
            if (computerGuess.toUpperCase().equals(correctGuess)) {
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
