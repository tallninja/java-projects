public class Main {

    public static void main(String[] arg) {
        calcFeetAndInchesToCM(5, 8);
        calcFeetAndInchesToCM(-1, 8);
        calcFeetAndInchesToCM(5, 13);
        calcFeetAndInchesToCM(5, -1);
        calcFeetAndInchesToCM(6);
    }

    public static void calcFeetAndInchesToCM(int feet, int inches) {
        // 1 foot = 12 inches
        // 1 inch = 2.54cm
        double centiMeters;
        if(feet >= 0){
            if(inches >= 0 && inches <= 12) {
                centiMeters = ((feet * 12) + inches) * 2.54;
                System.out.printf("%d Feet and %d Inches = %.4f cm %n", feet, inches, centiMeters);
            } else {
                System.out.println("Inches should be greater than 0 and less than 12 !");
            }
        } else {
            System.out.println("A foot can not be less than 0 !");
        }
    }

    // Method Overloading
    public static void calcFeetAndInchesToCM(int inches) {
        double centimeters;
        if(inches >= 0 && inches <= 12) {
            centimeters = inches * 2.54;
            System.out.printf("%d Inches = %.4f cm", inches, centimeters);
        } else {
            System.out.println("Inches should be greater than 0 and less than 12 !");
        }
    }
}
