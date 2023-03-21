public class Planet {

    public int numberOfMoons = 0;
    public String name = "unknown";

    Planet () {
    }
    Planet (int numberOfMoons){
        this.numberOfMoons = numberOfMoons;
    }

    Planet (String name){
        this.name = name;
        System.out.println("Я - планета по имени " + name);
    }

    Planet (int numberOfMoons, String name){
        this.numberOfMoons = numberOfMoons;
        this.name = name;
    }



}
