package rocket;

import enums.Planet;
import structure.Cabin;
import structure.Engine;

public abstract class Rocket implements Fly {
    private int weight = 2;
    private int countOfEngine;
    private Planet planet;
    private Cabin cabin;
    private Engine engine1,engine2,engine3;

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

    @Override
    public void flyInformation(){
        System.out.println("\nWeight of rocket is: "+this.weight+" tons\t"+
                "Power is: "+this.countOfEngine+"\t\tDestination planet: "+planet.getName());
        checkFlySuccess();
    }

    private void checkFlySuccess(){
        if((planet.getDistance()*engine1.getFuelConsumption()/2)<(engine1.getFuelTankSpace()*3))
        {
            System.out.println("\nHooray! You reached "+planet.getName());
        }
        else {
            System.out.println("Unfortunately your board crashed. Try to fill more fuel next time");
        }
    }
}
