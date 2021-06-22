import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see whether it is prime or not...");
        System.out.print("> ");
        int num = input.nextInt();
        String result = isPrime(num) ? "Prime" : "NOT Prime";
        System.out.printf("> %d is %s %n", num, result);
        input.close();
    }

    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }

        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
