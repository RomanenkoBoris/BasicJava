import java.util.Scanner;

public class CountManager {

    public static void countManager() {

        Scanner input = new Scanner(System.in);
        System.out.println("Добрый день! Пожалуйста введите одно из следующих значений:");
        System.out.println("1 - для перевода числа из десятичной системы счисления в двоичную;");
        System.out.println("2 - для перевода числа из десятичной системы счисления в троичную;");
        System.out.println("3 - для перевода числа из десятичной системы счисления в шестнадцатиричную;");
        System.out.println("4 - для перевода числа из доичной системы счисления в десятичную;");
        System.out.println("5 - для перевода числа из шестнадцатиричной системы счисления в десятичную;");

        int number = input.nextInt();

        switch (number){
            case 1:
                FomTenToTwo.fromTenToTwo();
                break;

            case 2:
                FromTenToThree.fromTenToThree();
                break;

            case 3:
                FromTenToSixteen.fromTenToSixteen();
                break;

            case 4:
                FromTwoToTen.fromTwoToTen();
                break;

            case 5:
                FromSixteenToTen.fromSixteenToTen();
                break;

        }

    }

}
