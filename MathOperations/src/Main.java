import de.telran.mathoperations.Plus;
import de.telran.mathoperations.Minus;
import de.telran.mathoperations.Division;
import de.telran.mathoperations.Multiplication;
public class Main {

    public static void main (String[] args){

        Plus myPlus = new Plus ();
        myPlus.plus(4,6);

        Minus myMinus = new Minus();
        myMinus.minus(10,4);

        Division myDivision = new Division();
        myDivision.devide(10, 4);

        Multiplication myMultiplication = new Multiplication();
        myMultiplication.multiply(4,6);


    }
}
