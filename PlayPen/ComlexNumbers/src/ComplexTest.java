import java.util.Scanner;

public class ComplexTest {

    public static void main(String[] args){
        double real, imaginary;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the real and imaginary values of num1: ");
        real = input.nextDouble();
        imaginary = input.nextDouble();
        Complex num1 = new Complex(real, imaginary);

        System.out.println("Enter the real and imaginary values of num2: ");
        real = input.nextDouble();
        imaginary = input.nextDouble();
        Complex num2 = new Complex(real, imaginary);

        System.out.println("Here are the results:");

        Complex sum = num1.add(num2);
        displayExpression(num1, num2, sum, '+');

        Complex difference = num1.subtract(num2);
        displayExpression(num1, num2, difference, '-');

        Complex product = num1.multiply(num2);
        displayExpression(num1, num2, product, '*');

        Complex quotient = num1.divide(num2);
        displayExpression(num1, num2, quotient, '/');

        Complex square = num1.square();
        displayExpression(num1, square, 's');

        Complex reciprocal = num1.reciprocate();
        displayExpression(num1, reciprocal, 'r');

        double magnitude = num1.getMagnitude();
        displayExpression(num1, magnitude, 'm');

        double angle = num1.getAngle();
        displayExpression(num1, angle, 'a');

        input.close();

    }

    public static void displayExpression(Complex num1, Complex num2, Complex result, char operator) {
        System.out.printf("(%s) %s (%s) = (%s)%n", num1.convertToString(), operator, num2.convertToString(), result.convertToString());
    }

    public static void displayExpression(Complex num, Complex result, char operationCode) {
        switch(operationCode) {
            case 's':
                System.out.printf("(%s)^2 = (%s)%n", num.convertToString(), result.convertToString());
                break;
            case 'r':
                System.out.printf("1 / (%s) = (%s)%n", num.convertToString(), result.convertToString());
                break;
            default:
                break;
        }
    }

    public static void displayExpression(Complex num, double result, char operationCode) {
        switch(operationCode) {
            case 'm':
                System.out.printf("(%.4f^2 + %.4f^2)^(1/2) = %.4f%n", num.getReal(), num.getImaginary(), result);
                break;
            case 'a':
                System.out.printf("tan^-1 (%.4f / %.4f) = %.4f degrees%n", num.getReal(), num.getImaginary(), result);
                break;
            default:
                break;
        }
    }

}