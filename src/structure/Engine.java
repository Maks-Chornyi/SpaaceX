package structure;

public class Engine {
    int heithg,width,weight,power,fuelConsumption,fuelTankSpace,firstSpaceSpeed,secondSpaceSpeed;

    public Engine(int heithg, int width, int weight, int power, int fuelConsumption,int fuelTankSpace, int firstSpaceSpeed, int secondSpaceSpeed) {
        this.heithg = heithg;
        this.width = width;
        this.weight = weight;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankSpace = fuelTankSpace;
        this.firstSpaceSpeed = firstSpaceSpeed;
        this.secondSpaceSpeed = secondSpaceSpeed;
    }

    public int getWeight() {return weight;}
    public int getFuelConsumption() {return fuelConsumption;}
    public int getFuelTankSpace() {return fuelTankSpace;}

}
