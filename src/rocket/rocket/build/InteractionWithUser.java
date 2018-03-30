package rocket.rocket.build;

import Enums.CabinEnum;
import Enums.EngineEnum;
import Enums.Planet;
import structure.Cabin;
import structure.Engine;

import java.util.Scanner;

public class InteractionWithUser {
    Scanner sc = new Scanner(System.in);
    String userInput;

    Cabin cabin;
    Engine engine1,engine2,engine3;
    Planet planet;

    public Cabin getCabin(){
        System.out.println("Hello! Choose one of the structure.Cabin and insert it name for use it:\n" +
                "CABIN89 -- SX435 -- OMEGA90 -- ORION -- COBRA");
        while(true) {
            userInput = sc.nextLine();
            try{
                userInput = CabinEnum.valueOf(userInput.toUpperCase()).toString();
                System.out.println("You chose "+userInput+" cabin");
                cabin = new Cabin(CabinEnum.valueOf(userInput.toUpperCase()).getHeight(),
                        CabinEnum.valueOf(userInput.toUpperCase()).getWeight(),
                        CabinEnum.valueOf(userInput.toUpperCase()).getWidth(),
                        CabinEnum.valueOf(userInput.toUpperCase()).getCapacity());

                return cabin;
            }
            catch (Exception e){
                System.out.println("naah, input again");
            }
        }
    }

    public Engine getEngine(){
        System.out.println("Choose one of the 3 engine you want and insert it name for use it:\n" +
                "SLOW -- NORMAL -- FAST -- VERYFAST-- FASTEST");
        while(true)
        {
            userInput = sc.nextLine();
            try{
                userInput = EngineEnum.valueOf(userInput.toUpperCase()).toString();
                System.out.println("You chose "+userInput+" engine. Good choice\n" +
                        "Enter how many gallons you want to fill in fuel tank (max "+
                        EngineEnum.valueOf(userInput.toUpperCase()).getFuelTankSpace()+
                        " gallons for this engine): ");
                boolean gallons = true;
                int howManyGallons = 0;
                while(gallons)
                {
                    if(sc.hasNextInt()) {
                        howManyGallons = sc.nextInt();
                        if(howManyGallons>0 && howManyGallons<EngineEnum.valueOf(userInput.toUpperCase()).getFuelTankSpace()+1) {
                            gallons = false;
                        } else {
                            System.out.println("Please, try again: ");
                        }
                    } else {
                        System.out.println("Please, try again: ");
                    }
                }
                engine1 = new Engine(EngineEnum.valueOf(userInput.toUpperCase()).getHeithg(),
                        EngineEnum.valueOf(userInput.toUpperCase()).getWidth(),
                        EngineEnum.valueOf(userInput.toUpperCase()).getWeight(),
                        EngineEnum.valueOf(userInput.toUpperCase()).getPower(),
                        EngineEnum.valueOf(userInput.toUpperCase()).getFuelConsumption(),
                        howManyGallons,
                        EngineEnum.valueOf(userInput.toUpperCase()).getFirstSpaceSpeed(),
                        EngineEnum.valueOf(userInput.toUpperCase()).getSecondSpaceSpeed());
                engine2 = engine1;
                engine3 = engine1;
                return engine1;
            }
            catch (Exception e){
                System.out.println("naah, input again");
            }
        }
    }

    public Planet getPlanet() {
        System.out.println("Choose any planet you want:\n" +
                "MERCURY -- VENUS -- MARS -- JUPITER -- SATURN -- URANUS -- NEPTUNE -- PLUTO");
        while(true) {
            userInput = sc.next();
            try{
                userInput = Planet.valueOf(userInput.toUpperCase()).toString();
                System.out.println("We are going to "+userInput+"!!!");
                planet = Planet.valueOf(userInput.toUpperCase());
                return planet;
            }
            catch (Exception e){
                System.out.println("naah, input again");
            }
        }
    }
}
