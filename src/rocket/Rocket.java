package rocket;

import enums.Planet;
import structure.Cabin;
import structure.Engine;

public abstract class Rocket implements SuccessFlyCheckable {
    private int weight = 2;
    private int countOfEngine;
    Planet planet;
    Cabin cabin;
    Engine engine1,engine2,engine3,engine4,engine5;

    public Rocket(Planet planet,Cabin cabin, Engine engine1, Engine engine2, Engine engine3) {
        this.planet = planet;
        this.cabin = cabin;
        this.engine1 = engine1;
        this.engine2 = engine2;
        this.engine3 = engine3;
        //fields of class
        this.countOfEngine = 3;
        this.weight = weight+cabin.getWeight()+engine1.getWeight()+engine2.getWeight()+engine3.getWeight();
    }

    public Rocket(Planet planet, Cabin cabin, Engine engine1, Engine engine2, Engine engine3, Engine engine4) {
        this(planet,cabin,engine1,engine2,engine3);
        this.engine4 = engine4;
        //fields of class
        this.countOfEngine = 4;
        this.weight = weight+engine4.getWeight();

    }

    public Rocket(Planet planet,Cabin cabin,Engine engine1,Engine engine2,Engine engine3,Engine engine4,Engine engine5){
        this(planet,cabin,engine1,engine2,engine3,engine4);
        this.engine5 = engine5;
        //fields of class
        this.countOfEngine = 5;
        this.weight = weight+engine5.getWeight();
    }

    @Override
    public void fly(){
        System.out.println("\nWeight of rocket is: "+this.weight+" tons\t"+
                "Power is: "+this.countOfEngine+"\t\tDestination planet: "+planet.getName());

        if((planet.getDistance()*engine1.getFuelConsumption()/2)<(engine1.getFuelTankSpace()*3))
        {
            System.out.println("\nHooray! You reached "+planet.getName());
        }
        else {
            System.out.println("Unfortunately your board crashed. Try to fill more fuel next time");
        }
    }
}
