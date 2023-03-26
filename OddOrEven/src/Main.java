import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter two numbers:");
        int numberA = input.nextInt();
        int numberB = input.nextInt();
        System.out.println("Do you really want to now, whether the sum of the numbers is even? Ok, the answer is:");
        System.out.println(Main.isTheSumEven(numberA, numberB));

    }

    public static boolean isTheSumEven (int firstNumber, int secondNumber){

        int sum = firstNumber + secondNumber;
        int rest = sum % 2;

        return rest == 0;
    }
}
