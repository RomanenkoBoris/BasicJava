public class Phone {

    double price;
    String category;

    Phone (double price, String category){
        this.category = category;
        this.price = price;

    }
    public String toString () {
        return getClass().getName() + "(" + price + ", " + category + ")";
    }
}
