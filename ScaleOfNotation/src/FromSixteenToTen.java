import java.util.Scanner;

public class FromSixteenToTen {
        public static void fromSixteenToTen () {
            Scanner input = new Scanner(System.in);
            System.out.println("Пожалуйста, введите число в шестнадцатиричной системе счисления:");
            String number = input.next();
            int result = 0;
            int rest;

            for (int i = 0; i < number.length(); i++){
                int number1 = Integer.valueOf(number);
                rest = number1 % 10;
                result = (int) (rest * Math.pow(16, i));
                number1 /= 10;
            }
            System.out.println("Указанное Вами число составляет " + result + " в десятичной системе счисления.");
    }
}
