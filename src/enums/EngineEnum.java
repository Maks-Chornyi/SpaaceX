package enums;

public enum EngineEnum {
    SLOW(2, 2, 2, 4, 2, 2200, 5, 10),
    NORMAL(3, 3, 3, 6, 3, 3300, 4, 8),
    FAST(4, 4, 4, 8, 4, 4400, 3, 6),
    VERYFAST(5, 5, 5, 10, 5, 5500, 2, 4),
    FASTEST(6, 6, 6, 12, 6, 6600, 1, 2);
    int height, width, weight, power, fuelConsumption, fuelTankSpace, firstSpaceSpeed, secondSpaceSpeed;

    EngineEnum(int heithg, int width, int weight, int power, int fuelConsumption,
               int fuelTankSpace, int firstSpaceSpeed, int secondSpaceSpeed) {
        this.height = heithg;
        this.width = width;
        this.weight = weight;
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.fuelTankSpace = fuelTankSpace;
        this.firstSpaceSpeed = firstSpaceSpeed;
        this.secondSpaceSpeed = secondSpaceSpeed;
    }

    public int getHeithg() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getFuelTankSpace() {
        return fuelTankSpace;
    }

    public int getFirstSpaceSpeed() {
        return firstSpaceSpeed;
    }

    public int getSecondSpaceSpeed() {
        return secondSpaceSpeed;
    }
}
