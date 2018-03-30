package structure;

public class Cabin {
    int height,weight,width,capacity;

    public Cabin(int height, int weight, int width, int capacity) {
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.capacity = capacity;
    }

    public int getHeight() {return height;}
    public int getWeight() {return weight;}
    public int getWidth() {return width;}
    public int getCapacity() {return capacity;}
}
