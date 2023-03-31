import java.util.concurrent.Callable;

public class Main {

    public static void main (String[] args){

        Account myCurrentAccount = new Account(1700, "captain");
        Car astonMartin = new Car(100000, "stylish");
        Car vwMultiVan = new Car(50000, "scientist");
        Phone iPhone = new Phone(1100, "captain");
        Phone samsung = new Phone(500,"programmer");
        Plane privetJet = new Plane(30000000, "stylish");
        Plane oldBombardier = new Plane(500000, "scientist");
        DownschifterKit startKit = new DownschifterKit(0,"programmer");



        Object article = new Object();
        article = chooseYourArticle(myCurrentAccount, astonMartin, vwMultiVan, iPhone, samsung, privetJet, oldBombardier, startKit);

        System.out.println("The following article corresponds to your preferences and possibilities:");
        System.out.println(article.toString());


    }
    public static Object chooseYourArticle (Account myAccount, Car myCar, Car car, Phone myPhone, Phone phone,
                                            Plane myPlane, Plane plane, DownschifterKit myKit){
        if (myAccount.currentAmount >= myCar.price && myAccount.category.equals(myCar.category)){
            return myCar;
        }
        else if (myAccount.currentAmount >= car.price && myAccount.category.equals(car.category)){
            return car;
        }
        else if (myAccount.currentAmount >= myPhone.price && myAccount.category.equals(myPhone.category)){
            return myPhone;
        }
        else if (myAccount.currentAmount >= phone.price && myAccount.category.equals(phone.category)){
            return phone;
        }
        else if (myAccount.currentAmount >= myPlane.price && myAccount.category.equals(myPlane.category)){
            return myPlane;
        }
        else if (myAccount.currentAmount >= plane.price && myAccount.category.equals(plane.category)){
            return plane;
        } else {
            return myKit;
        }

    }


}
