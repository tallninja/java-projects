public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void add(Fraction fraction) {
        int newDenominator = LCM(this.denominator, fraction.getDenominator());
        int newNumerator = ((newDenominator / this.denominator) * this.numerator) + ((newDenominator / fraction.getDenominator()) * fraction.getNumerator());
        displayResults(fraction, '+', newNumerator, newDenominator);
    }

    public void subtract(Fraction fraction) {
        int newDenominator = LCM(this.denominator, fraction.getDenominator());
        int newNumerator = ((newDenominator / this.denominator) * this.numerator) - ((newDenominator / fraction.getDenominator()) * fraction.getNumerator());
        displayResults(fraction, '-', newNumerator, newDenominator);
    }

    public void displayFraction() {
        System.out.printf("%d / %d", this.numerator, this.denominator);
    }

    public void displayDecimal() {
        System.out.printf("%.4f", (float) this.numerator / (float) this.denominator);
    }

    private static int LCM(int num1, int num2) {
        int lcm = Math.max(num1, num2);
        while (lcm % num1 != 0 || lcm % num2 != 0) {
            ++lcm;
        }
        return lcm;
    }

    private void displayResults(Fraction fraction, char operator, int numerator, int denominator) {
        this.displayFraction();
        System.out.printf(" %s ", operator);
        fraction.displayFraction();
        System.out.print(" = ");
        System.out.printf("%d / %d %n", numerator, denominator);
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

}
