// done
public class Challenge {
    public static void main(String[] args) {
        byte byteVar = 126;
        short shortVar = 30000;
        int intVar = 100000;
        long longVar = 50000 + (10 * (byteVar + shortVar + intVar));
        System.out.println("Answer: " + longVar);
    }
}
