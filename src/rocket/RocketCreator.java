package rocket;

import Enums.Planet;
import rocket.rocket.build.InteractionWithUser;
import structure.Cabin;
import structure.Engine;

public class RocketCreator {
    InteractionWithUser interaction = new InteractionWithUser();
    Cabin cabin;
    Engine engine;
    Planet planet;
    Rocket spaceX;

    public void createRocket() {
        this.cabin = interaction.getCabin();
        this.engine = interaction.getEngine();
        this.planet = interaction.getPlanet();
        spaceX = new SpaceX(planet, cabin, engine, engine, engine);
        spaceX.fly();
    }
}
