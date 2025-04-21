package java_01_심화;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = Integer.toString(10);
        String str2 = Double.toString(3.14);
        String str3 = Boolean.toString(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
