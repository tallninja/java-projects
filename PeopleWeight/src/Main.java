import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 5;
        float[] weights = new float[n];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter Weight %d: ", i + 1);
            weights[i] = input.nextFloat();
        }

        System.out.println();
        System.out.print("You Entered: ");
        for (int i = 0; i < weights.length; i++) {
            System.out.printf("%.2f ", weights[i]);
        }
        System.out.println();

        float totalWeight = calculateTotal(weights);
        float averageWeight = calculateAverage(weights);
        float maxWeight = getMaxWeight(weights);

        System.out.printf("Total Weight: %.4f %n", totalWeight);
        System.out.printf("Average Weight: %.4f %n", averageWeight);
        System.out.printf("Max Weight: %.4f %n", maxWeight);
    }

    public static float calculateTotal(float[] weights) {
        float total = 0;
        for (int i = 0; i < weights.length; i++) {
            total += weights[i];
        }
        return total;
    }

    public static float calculateAverage(float[] weights) {
        float total = calculateTotal(weights);
        return total / weights.length;
    }

    public static float getMaxWeight(float[] weights) {
        float max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        return max;
    }
}
