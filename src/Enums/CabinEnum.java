package Enums;

public enum CabinEnum {
    CABIN89("CABIN89", 1, 1, 1, 1),
    SX435("SX435", 2, 2, 2, 2),
    OMEGA90("OMEGA90", 3, 3, 3, 3),
    ORION("ORION", 4, 4, 4, 4),
    COBRA("COBRA", 5, 5, 5, 5);
    String name;
    int height, weight, width, capacity;

    CabinEnum(String name, int height, int weight, int width, int capacity) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWidth() {
        return width;
    }

    public int getCapacity() {
        return capacity;
    }
}
