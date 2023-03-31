public class DownschifterKit {

    double price;
    String category;

    DownschifterKit (double price, String category){
        this.category = category;
        this.price = price;

    }
    public String toString () {
        return getClass().getName() + "(" + price + ", " + category + ")";
    }
}
