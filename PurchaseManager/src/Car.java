public class Car {

    double price;
    String category;

    Car (double price, String category){
        this.category = category;
        this.price = price;

    }
    public String toString () {
        return getClass().getName() + "(" + price + ", " + category + ")";
    }

}
