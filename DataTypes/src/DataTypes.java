public class DataTypes {
    public static void main(String[] args) {
        // Bytes 8-bits
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Byte Max Value: " + maxByte);
        System.out.println("Byte Min Value: " + minByte);

        byte myTotal = (byte) (maxByte / 2); // casting || same as int(x) in python of x.parseInt() in javascript:

        // Shorts 16-bits
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        System.out.println("Short Max Value: " + maxShort);
        System.out.println("Short Min Value: " + minShort);

        // Integers 32-bits
        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;
        System.out.println("Int Max Value: " + maxInteger);
        System.out.println("Int Min Value: " + minInteger);

        // Longs 64-bits
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long Max Value: " + maxLong);
        System.out.println("Long Min Value: " + minLong);

        // Floats 32-bits || single precision :
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Float Max Value" + maxFloat);
        System.out.println("Float Min Value" + minFloat);

        // Doubles 64-bits || double precision :
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("Double Max Value: " + maxDouble);
        System.out.println("Double Min Value: " + minDouble);

        // The concept of double precision :
        int myInt = 5 / 3;
        float myFloat = 5f / 3;
        double myDouble = 5d / 3;
        System.out.println("My Int: " + myInt);
        System.out.println("My Float: " + myFloat);
        System.out.println("My Double: " + myDouble);
    }
}