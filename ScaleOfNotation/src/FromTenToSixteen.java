import java.util.Scanner;

public class FromTenToSixteen {
    public static void fromTenToSixteen() {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число в десятичной системе счисления:");
        int number = input.nextInt();
        String result = "";
        int rest;
        while (number != 0) {
            rest = number % 16;
            result = rest + result;
            number /= 16;
        }
        System.out.println ("Указанное Вами число составляет " + result + " в шестнадцатиричной системе счисления.");
    }

}
