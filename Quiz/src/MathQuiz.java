import java.util.Random;
import java.util.Scanner;

public class MathQuiz {


    public static void main (String[] args){
        System.out.println("Hello! Do you want to play a math quiz? (yes/no)");

        Scanner input1 = new Scanner(System.in);

        String answer1 = input1.next();
        if (answer1.equals("yes")){
            System.out.println("Cool! Let's play!");
            MathQuiz.answerTheQuestion();
        } else {
            System.out.println("Ok, goodbye than...");
        }




    }
    public static void answerTheQuestion() {

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            System.out.println ("Could you please answer the question number " + i + ":");
            System.out.println ("What number do you get when you add number " +
                    number1 + " and number " + number2 + " ?");
            int result = number1 + number2;
            Scanner input2 = new Scanner(System.in);
            int answer2 = input2.nextInt();
            if (answer2 == result){
                System.out.println("Excellent! You are total wright!");
            } else {
                System.out.println("Unfortunately you have been wrong...");
            }


        }


    }

}
