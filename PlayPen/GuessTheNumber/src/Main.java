import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int max = 10;
        int numOfAttempts = 5;
        int attemptsLeft = numOfAttempts;
        Scanner input = new Scanner(System.in);
        int correct = (int) (Math.random() * max + 1);
        // System.out.println(correct);

        while(true) {
            if(attemptsLeft > 0) {
                System.out.printf("%d attempt%s left: %nGuess a number between 1 and %d %n> ",
                        attemptsLeft, attemptsLeft == 1 ? "" : "s" , max);

                boolean isAnInt = input.hasNextInt();

                if(isAnInt) {
                    int userGuess = input.nextInt();
                    if(userGuess < correct) {
                        System.out.printf("%d is too LOW %n", userGuess);
                    } else if(userGuess > correct) {
                        System.out.printf("%d is too HIGH %n", userGuess);
                    } else {
                        System.out.printf(
                                "CONGRATULATIONS champ %d is CORRECT ! %nYou got it in just %d attempts",
                                userGuess, numOfAttempts - attemptsLeft);
                        break;
                    }
                } else {
                    System.out.print("Please enter a valid value !");
                    break;
                }
            } else {
                System.out.printf("Ooh bummer you have exhausted your number of attempts ! %nBetter luck next time :( %n");
                break;
            }

            attemptsLeft--;
        }


        input.close();
    }

}
