package rocket;

import enums.Planet;
import rocket.build.InteractionWithUser;
import structure.Cabin;
import structure.Engine;

public class RocketCreator {
    InteractionWithUser interaction = new InteractionWithUser();
    private Cabin cabin;
    private Engine engine;
    private Planet planet;
    private Rocket spaceX;

    public void createRocket() {
        this.cabin = interaction.getCabin();
        this.engine = interaction.getEngine();
        this.planet = interaction.getPlanet();
        spaceX = new SpaceX(planet, cabin, engine, engine, engine);
        spaceX.flyInformation();
    }
}
