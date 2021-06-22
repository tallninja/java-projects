public class Challenge {
    public static void main(String[] args) {
        double x = 37.00;
        double y = 80.00;
        double z = (x + y) * 100.00;
        double rem = z % 40.00;
        boolean hasRemainder = rem != 0.0;
        if (hasRemainder) {
            System.out.println("Has Remainder");
        } else {
            System.out.println("No remainder");
        }
    }
}