import java.util.Scanner;

public class Main {



    public static void main (String[] args){
        Main.replaceOfTwoNumbers();

    }
    public static void replaceOfTwoNumbers (){
        Scanner input = new Scanner(System.in);
        System.out.println ("Please enter the Numbers which you want to replace:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        firstNumber += secondNumber;
        secondNumber = firstNumber -secondNumber;
        firstNumber -= secondNumber;
        System.out.println("The numbers did you enter are replaced:");
        System.out.println(firstNumber);
        System.out.println(secondNumber);

    }
}
