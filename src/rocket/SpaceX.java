package rocket;

import Enums.Planet;
import structure.Cabin;
import structure.Engine;

public class SpaceX extends Rocket {
    public SpaceX(Planet planet, Cabin cabin, Engine engine1, Engine engine2, Engine engine3) {
        super(planet,cabin, engine1, engine2, engine3);
    }

    public SpaceX(Planet planet, Cabin cabin, Engine engine1, Engine engine2, Engine engine3, Engine engine4) {
        super(planet,cabin, engine1, engine2, engine3, engine4);
    }

    public SpaceX(Planet planet,Cabin cabin, Engine engine1, Engine engine2, Engine engine3, Engine engine4, Engine engine5) {
        super(planet,cabin, engine1, engine2, engine3, engine4, engine5);
    }
}
