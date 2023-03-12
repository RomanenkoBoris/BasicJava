import java.util.Scanner;

public class FromTenToThree {
    public static void fromTenToThree() {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число в десятичной системе счисления:");
        int number = input.nextInt();
        String result = "";
        int rest;
        while (number != 0) {
            rest = number % 3;
            result = rest + result;
            number /= 3;
        }
        System.out.println("Указанное Вами число составляет " + result + " в троичной системе счисления.");
    }
}
