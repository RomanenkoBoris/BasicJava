import java.util.Scanner;

public class FromTwoToTen {
    public static void fromTwoToTen () {
        Scanner input = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число в двоичной системе счисления:");
        String number = input.next();
        int result = 0;
        int rest;

        for (int i = 0; i < number.length(); i++){
            int number1 = Integer.valueOf(number);
            rest = number1 % 10;
            result = (int) (rest * Math.pow(2, i));
            number1 /= 10;
        }
        System.out.println("Указанное Вами число составляет " + result + " в десятичной системе счисления.");
    }
}
