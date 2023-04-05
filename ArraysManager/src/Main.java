import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {5, 26, 12, 4, 47, 56, 99, 1, 14, 88};
        boolean isItIncrease = false;

        Main.arrayManager(intArray, isItIncrease);


    }

    public static void arrayManager(int[] array, boolean isItRealyIncrease) {

        boolean isArraySorted = false;
        while (!isArraySorted) {
            isArraySorted = true;
            if (isItRealyIncrease) {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int a = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = a;
                        isArraySorted = false;
                    }
                }

            } else {
                for (int i = 1; i < array.length; i++) {
                    if (array[i-1] < array[i]) {
                        int a = array[i-1];
                        array[i-1] = array[i];
                        array[i] = a;
                        isArraySorted = false;
                    }
                }

            }


        }
        System.out.println(Arrays.toString(array));
    }
}