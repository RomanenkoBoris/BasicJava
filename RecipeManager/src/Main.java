import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println ("To get a recipe,please enter the name of the dish you want to cook:");
        String recipe = input.next();

        switch (recipe){
            case "Calzones":
                System.out.println("Make dough: Dissolve yeast in warm water in a mixing bowl; let sit until foamy, " +
                        "about 5 minutes. Add 1 tablespoon oil, sugar, and salt; mix in 1 cup flour until smooth. " +
                        "Gradually stir in remaining flour until dough is smooth and workable...");
            break;

            case "Meatballs":
                System.out.println("Stir egg, grated Parmesan cheese, 3/4 cup panko crumbs, garlic powder, " +
                        "Italian herb seasoning blend, crushed red pepper, salt, and black pepper together in a " +
                        "large bowl... ");
            break;

            case ("Quiche"):
                System.out.println ("While a crustless quiche and a frittata are made up of similar ingredients (eggs," +
                        " dairy, and add-ins), they are different things. The main difference comes from the baking " +
                        "techniques. Quiches are baked like tarts, in a pie pan in the oven. While frittatas are first " +
                        "cooked like an open-faced omelet in a cast-iron skillet, and then transferred to the oven for " +
                        "the last few minutes of the bake...");
            break;

            case ("Tacos"):
                System.out.println ("This sensational shrimp taco recipe with spicy seasoned shrimp, zesty lime crema, " +
                        "avocado, and cilantro is easy to make and so delicious. Everyone enjoys these tacos when I make" +
                        " them....");
            break;

            case ("Lasagna"):
                System.out.println ("The Allrecipes community adores this lasagna recipe because it's incredibly " +
                        "customizable, so you can easily alter the ingredient list to suit your needs. If you want to " +
                        "stay true to the original recipe, though, these are the ingredients you'll need to add to your " +
                        "grocery list:...");
            break;

            case ("Spaghetti"):
                System.out.println ("Heat olive oil in a pot over medium heat. Add garlic and sizzle until it starts to " +
                        "turn golden and fragrant, about 1 minute. Stir in tomato puree, water, and salt. Bring to a " +
                        "simmer on medium-high. Once simmering, reduce to low heat and keep warm... ");
            break;

            default:
                System.out.println("Unfortunately we have no recipe for the dish you've entered.");
        }

    }

}
