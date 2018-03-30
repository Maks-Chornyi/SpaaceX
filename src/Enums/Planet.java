package Enums;

public enum Planet {
    MERCURY("MERCURY",2000),
    VENUS("VENUS",1000),
    MARS("MARS",1000),
    JUPITER("JUPITER",2000),
    SATURN("SATURN",3000),
    URANUS("URANUS",4000),
    NEPTUNE("NEPTUNE",5000),
    PLUTO("PLUTO",6000);

    private String name;
    private int distance;

    Planet(String name, int distance){
        this.name = name;
        this.distance = distance;
    }

    public String getName() {return name;}
    public int getDistance() {return distance;}
}

