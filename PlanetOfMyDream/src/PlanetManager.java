public class PlanetManager {

    public static void main (String[] args){

        Planet a = new Planet();

        Planet b = new Planet("Mercury");

        Planet c = new Planet(2);

        Planet d = new Planet (1, "Earth");

        Planet e = new Planet(95, "Jupiter");

        System.out.println("Планета " + a.name+ ", количество спутников - " + a.numberOfMoons);

        System.out.println("Планета " + b.name+ ", количество спутников - " + b.numberOfMoons);

        System.out.println("Планета " + c.name+ ", количество спутников - " + c.numberOfMoons);

        System.out.println("Планета " + d.name+ ", количество спутников - " + d.numberOfMoons);

        System.out.println("Планета " + e.name+ ", количество спутников - " + e.numberOfMoons);



    }
}
