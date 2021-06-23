public class ComplexTest {

    public static void main(String[] args){
        Complex num1 = new Complex(5, 10);
        Complex num2 = new Complex(7, 11);
        Complex sum = num1.add(num2);
        Complex difference = num1.subtract(num2);
        Complex product = num1.multiply(num2);
        Complex square = num1.square();
        Complex reciprocal = num1.reciprocate();
        Complex quotient = num1.divide(num2);
        double magnitude = num1.getMagnitude();
        double angle = num1.getAngle();

        System.out.printf("Real part: %.4f %nImaginary part: %.4f%n", num1.getReal(), num1.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", sum.getReal(), sum.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", difference.getReal(), difference.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", product.getReal(), product.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", square.getReal(), square.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", reciprocal.getReal(), reciprocal.getImaginary());
        System.out.printf("%nReal part: %.4f %nImaginary part: %.4f%n", quotient.getReal(), quotient.getImaginary());
        System.out.printf("%nMagnitude: %.4f%n", magnitude);
        System.out.printf("%nAngle: %.4f%n", angle);
    }

}