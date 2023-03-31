public class Plane {

    double price;
    String category;

    Plane (double price, String category){
        this.category = category;
        this.price = price;

    }
    public String toString () {
        return getClass().getName() + "(" + price + ", " + category + ")";
    }
}
