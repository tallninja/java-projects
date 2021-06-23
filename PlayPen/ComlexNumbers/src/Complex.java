import jdk.jfr.Unsigned;

public class Complex {

    private double real;
    private double imaginary;

    // new Complex(real, imaginary)
    public Complex(double real, double imaginary) {
         setReal(real); // validate real number
         setImaginary(imaginary); // validate imaginary number
    }

    // Complex num1 = new Complex(real, imaginary);
    // Complex num2 = new Complex(real, imaginary);
    // num1.add(num2: Complex); -> Complex;
    public Complex add(Complex num) {
        double real = this.getReal() + num.getReal();
        double imaginary = this.getImaginary() + num.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex num) {
        double real = this.getReal() - num.getReal();
        double imaginary = this.getImaginary() - num.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex num) {
        double real = ((this.getReal() * num.getReal()) - (this.getImaginary() * num.getImaginary()));
        double imaginary = ((this.getReal() * num.getImaginary()) + (this.getImaginary() * num.getReal()));
        return new Complex(real, imaginary);
    }

    public Complex square() {
        double real = sqr(this.getReal()) - sqr(this.getImaginary());
        double imaginary = 2 * this.getReal() * this.getImaginary();
        return new Complex(real, imaginary);
    }

    public Complex reciprocate() {
        double real = this.getReal() / (sqr(this.getReal()) + sqr(this.getImaginary()));
        double imaginary = -(this.getImaginary() / (sqr(this.getReal()) + sqr(this.getImaginary())));
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex num) {
        double real = ((this.getReal() * num.getReal()) + (this.getImaginary() * num.getImaginary())) / (sqr(num.getReal()) + sqr(num.getImaginary()));
        double imaginary = ((this.getImaginary() * num.getReal()) - (this.getReal() * num.getImaginary())) / (sqr(num.getReal()) + sqr(num.getImaginary()));
        return new Complex(real, imaginary);
    }

    public double getMagnitude() {
        return mag(this.getReal(), this.getImaginary());
    }

    public double getAngle() {
        return Math.atan2(this.getImaginary(), this.getReal()) * 57.2958;
    }

    // x + yj;
    public String convertToString() { // ternary operator
        return String.format("%.4f %s %.4fj", this.getReal(), (this.getImaginary() < 0 ? "-" : "+"), (this.getImaginary() < 0 ? this.getImaginary() * -1 : this.getImaginary()));
    }

    // getting the real number
    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    private double sqr(double num) {
        return num * num;
    }

    private double mag(double num1, double num2) {
        return Math.sqrt((sqr(num1) + sqr(num2)));
    }

}