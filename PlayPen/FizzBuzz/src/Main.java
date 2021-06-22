import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit of the loop:");
        System.out.print("> ");
        int limit = input.nextInt();

        for(int i = 1; i <= limit; i++) {
            if(i % num1 == 0 && i % num2 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % num1 == 0) {
                System.out.println("Fizz");
            } else if (i % num2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

        input.close();
    }

}
