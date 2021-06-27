public class FractionTest {

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(16, 7); // 1/2
        Fraction fraction2 = new Fraction(7, 13); // 1/4

        fraction1.add(fraction2);
        fraction1.subtract(fraction2);
    }

}
