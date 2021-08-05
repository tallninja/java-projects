import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Hospital {

    public static void main(String[] args) {

        String[] names = { "Ernest", "Wambua", "Mutisya", "Eva", "Mwende", "Linda", "Waeni", "Fred", "Frank",
                            "Mirriam", "Mildred", "Bob", "Josh", "James", "Jake", "Blake", "Michelle",
                            "Ann", "Esther", "Heather", "Hillary", "Pamela", "Martha", "Stacy", "Mary",
                            "Phill", "Jayden", "Greg", "Collins", "Junn", "Will", "Sean", "Winfrey", "Miley",
                            "Breanna", "Taylor", "Latisha", "Marie", "Gilbert", "Jones", "Arianna", "Michael",
                            "Candice", "Patience", "Liz", "Daisy", "Barbie", "Alex", "Allan", "Bill", "Chris"};
        int[] ages = { 7, 12, 24, 36, 43, 58, 61, 70, 87, 99 };
        String[] bloodGroups = { "A", "B", "AB", "O" };

        List<Patient> patients = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            Patient patient = new Patient(names[(int) (Math.random() * names.length)],
                                          ages[(int) (Math.random() * ages.length)],
                                          bloodGroups[(int) (Math.random() * bloodGroups.length)]);
            patients.add(patient);
        }

        for (Patient patient : patients) {
            System.out.println(patient);
        }

        System.out.printf("%n%nMean Age: %.2f %nMedian Age: %d %nModal Age: %d %nOldest Patient: %s %nYoungest Patient: %s" +
                        "%nBlood Group Summary: %s%n%n", getMeanAge(patients), getMedianAge(patients), getModalAge(patients),
                            getOldest(patients), getYoungest(patients), getBloodGroupSummary(patients));

    }

    public static double getMeanAge(List<Patient> patients) {
        double totalAges = 0;
        for(Patient patient : patients) {
            totalAges += patient.getAge();
        }

        return totalAges / patients.size();
    }

    public static int getMedianAge(List<Patient> patients) {
        int[] ages = new int[patients.size()];
        for(int i = 0; i < patients.size(); i++) {
            ages[i] = patients.get(i).getAge();
        }
        int[] sortedAges = sort(ages);

        if (sortedAges.length % 2 != 0) {
            return sortedAges[ages.length / 2 + 1];
        } else {
            return sortedAges[ages.length / 2 - 1] / ages[ages.length / 2 + 1];
        }
    }

    public static int getModalAge(List<Patient> patients) {
        int[] ages = new int[patients.size()];

        for(int i = 0; i < patients.size(); i++) {
            ages[i] = patients.get(i).getAge();
        }

        int[] uniq = Arrays.stream(ages).distinct().toArray();
        int[] freq = new int[uniq.length];

        for(int i = 0; i < uniq.length; i++) {
            int x = uniq[i];
            if(Arrays.stream(ages).anyMatch(age -> age == x)) {
                freq[i]++;
            }
        }

        return uniq[max(freq)];
    }

    public static Patient getOldest(List<Patient> patients) {
        int[] ages = new int[patients.size()];

        for(int i = 0; i < patients.size(); i++) {
            ages[i] = patients.get(i).getAge();
        }

        return patients.get(max(ages));
    }

    public static Patient getYoungest(List<Patient> patients) {
        int[] ages = new int[patients.size()];

        for(int i = 0; i < patients.size(); i++) {
            ages[i] = patients.get(i).getAge();
        }

        return patients.get(min(ages));
    }

    public static String getBloodGroupSummary(List<Patient> patients) {
        int A = 0;
        int B = 0;
        int AB = 0;
        int O = 0;

        for (Patient patient : patients) {
            switch (patient.getBloodGroup()) {
                case "A":
                    A++;
                    break;
                case "B":
                    B++;
                    break;
                case "AB":
                    AB++;
                    break;
                case "O":
                    O++;
                    break;
                default:
                    break;
            }
        }

        return String.format("A: %.2f, B: %.2f, AB: %.2f, O: %.2f",
                            (double) A * 100 / patients.size(), (double) B * 100 / patients.size(),
                            (double) AB * 100 / patients.size(), (double) O * 100 / patients.size());
    }

    public static int max(int[] array) {
        int max = 0;
        int maxIdx = 0;

        for(int i = 0; i < array.length; i++ ) {
            if(array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int min(int[] array) {
        int min = array[0];
        int minIdx = 0;

        for(int i = 0; i < array.length; i++ ) {
            if(array[i] < min) {
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
