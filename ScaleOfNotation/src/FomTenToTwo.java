import java.util.Scanner;

public class FomTenToTwo {

        public static void fromTenToTwo() {
            Scanner input = new Scanner(System.in);
            System.out.println("Пожалуйста, введите число в десятичной системе счисления:");
            int number = input.nextInt();
            String result = "";
            int rest;
            while (number != 0) {
                rest = number % 2;
                result = rest + result;
                number /= 2;
            }
            System.out.println("Указанное Вами число составляет " + result + " в двоичной системе счисления.");
        }

    }

