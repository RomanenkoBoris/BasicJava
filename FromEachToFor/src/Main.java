public class Main {

    public static void main (String[] args){
        Fruit[] fruits = {
                new Fruit("apple", true, "green"),
                new Fruit("cherry", true, "red/white/black"),
                new Fruit("banana", true, "yellow/green")
        };


        int iterationNum = 0;

        //   (Переменная для хран. фруктов) : (название массива с фруктами)
        for (Fruit currentFruit : fruits) {
            System.out.println("Iteration: " + iterationNum);
            System.out.println("Fruit name: " + currentFruit.name);
            System.out.println("Fruit color: " + currentFruit.color);
            System.out.println("Fruit is tasty?: " + currentFruit.isItTasty);
            iterationNum++;
        }

        for (int i = 0; i < 3; i++){
            System.out.println ("Iteration: " + i);
            System.out.println("Fruit name: " + fruits[i].name);
            System.out.println("Fruit color: " + fruits[i].color);
            System.out.println("Fruit is tasty?: " + fruits[i].isItTasty);
            }
    }
}
