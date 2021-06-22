import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        calculator();
    }

    public static void calculator() {
        int num1, num2;
        char operator;

        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        num1 = input.nextInt();
        operator = input.next().charAt(0);
        num2 = input.nextInt();
        String result = calculate(num1, num2, operator);
        System.out.println("> " + result);
    }

    public static String calculate(int num1, int num2, char operator) {
        switch(operator) {
            case '+':
                return String.format("%d %n", add(num1, num2));
            case '-':
                return String.format("%d %n", subtract(num1, num2));
            case '*': case 'X': case 'x':
                return String.format("%.2f %n", multiply(num1, num2));
            case '/':
                return String.format("%.4f %n", divide(num1, num2));
            default:
                return "Please enter a valid operation !";
        }

//        // Enhanced Switch Statement
//        return switch (operator) {
//            case '+' -> String.format("%d %n", add(num1, num2));
//            case '-' -> String.format("%d %n", subtract(num1, num2));
//            case '*', 'X', 'x' -> String.format("%.2f %n", multiply(num1, num2));
//            case '/' -> String.format("%.4f %n", divide(num1, num2));
//            default -> "Please enter a valid operation !";
//        };
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

}
