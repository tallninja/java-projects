public class Main {

    public static void main(String[] args) {
        int[] myArr = {4, 7, 2, 1, 6, 8, 0, 9, 3};
        System.out.print("Array: [");
        for(int value : myArr) {
            System.out.printf("%d, ", value);
        }
        System.out.printf("] %n");

        int[] sortedArray = sort(myArr);
        System.out.print("Sorted Array: [");
        for(int value : sortedArray) {
            System.out.printf("%d, ", value);
        }
        System.out.printf("] %n");
    }

    public static int[] sort(int[] arr) {
        for(int i = arr.length; i > 0; i--) {
            for(int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}