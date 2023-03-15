public class Main {
    public static void main (String[] args){

        String str1 = "I study Basic Java";

        System.out.println(str1.length());

        System.out.println(str1.charAt(17));

        System.out.println(str1.contains ("Java"));

        System.out.println(str1.replaceAll("a","o"));

        System.out.println(str1.toUpperCase());

        System.out.println(str1.toLowerCase());

        System.out.println(str1.substring(5,10));

        byte byteValue = 127;

        int intValue = 10548;

        double doubleValue = 10.546;

        float floatValue = 2.53f;

        int newValue1 = intValue + byteValue;

        double newValue2 = byteValue + intValue + doubleValue + floatValue;

        byte newValue3 = (byte) (intValue + byteValue);

        float newValue4 = (float) (doubleValue + floatValue);

        System.out.println(newValue1);

        System.out.println(newValue2);

        System.out.println(newValue3);

        System.out.println(newValue4);
    }
}
