import java.util.Scanner;

public class VectorTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vector1's x, y, and z components respectively:");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int z1 = input.nextInt();
        System.out.println("Enter vector2's x, y, and z components respectively:");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int z2 = input.nextInt();
        System.out.println("Performing Calculations...");
        System.out.println();

        Vector vector1 = new Vector(x1, y1, z1);
        Vector vector2 = new Vector(x2, y2, z2);

        System.out.println("vector1 = " + vector1.toString());
        System.out.println("vector2 = " + vector2.toString());
        System.out.println();

        Vector sum = vector1.add(vector2);
        System.out.println("vector1 + vector2 = " + sum.toString());
        Vector difference = vector1.subtract(vector2);
        System.out.println("vector1 - vector2 = " + difference.toString());
        Vector crossProduct = vector1.crossProduct(vector2);
        System.out.println("vector1 x vector2 = " + crossProduct.toString());
        int dotProduct = vector1.dotProduct(vector2);
        System.out.println("vector1 . vector2 = " + dotProduct);
        System.out.println();

        System.out.printf("vector1 magnitude = %.4f%n", vector1.calculateMagnitude());
        System.out.printf("vector1 magnitude = %.4f%n", vector2.calculateMagnitude());
        System.out.println();

        System.out.print("vector1 direction angle = ");
        vector1.getDirectionAngle();
        System.out.print("vector2 direction angle = ");
        vector2.getDirectionAngle();
        System.out.println();

        double angle = vector1.getAngle(vector2);
        System.out.printf("Angle between vector1 and vector2 = %.4f%n", angle);
        if (vector1.isParallelTo(vector2)) {
            System.out.println("vector1 is parallel to vector2");
        } else if(vector1.isSameAs(vector2)) {
            System.out.println("vector1 is equal to vector2");
        } else {
            System.out.println("vector1 is not parallel to vector2");
        }
        System.out.println();
        input.close();
    }

}
