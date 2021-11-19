import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String string1, string2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter String 1:");
        string1 = input.nextLine();

        System.out.println("Enter String 2:");
        string2 = input.nextLine();

        if(string1.length() != string2.length()) {
            System.out.println("The two strings should be of equal length");
        } else {
            System.out.println("Hamming Distance = " + hammingDistance(string1, string2));
        }

        String string3;
        int hammingDistance;

        System.out.println("Enter String:");
        string3 = input.nextLine();
        System.out.println("Enter Hamming Distance:");
        hammingDistance = input.nextInt();

        System.out.println("String 2 = " + generateString(string3, hammingDistance));



    }

    public static int hammingDistance(String string1, String string2) {
        int count = 0;

        for(int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static String generateString(String string3, int hammingDistance) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < string3.length(); i++) {
            sb.append(string3.charAt(i));
        }

        return sb.toString();
    }

}
