package structure;

public class FuelTank {
    int height,width,weight,capacity;

    public FuelTank(int height, int width, int weight, int capacity) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getHeight() {return height;}
    public int getWidth() {return width;}
    public int getWeight() {return weight;}
    public int getCapacity() {return capacity;}
}
