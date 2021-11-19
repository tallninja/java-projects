import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();


        int[] array = generateArray();
        for (int j : array) {
            System.out.println(j);
        }
    }

    public static int[] generateArray() {
        int[] array = new int[20];

        for(int i = 1; i <= array.length; i++) {
            int exp = 21 - i;
            if(2 % i == 0) {
                array[i - 1] = (int) Math.pow(2, exp);
            } else {
                array[i - 1] = -(int) Math.pow(2, exp);
            }
        }

        return array;
    }

}
