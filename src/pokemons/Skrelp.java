package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.SludgeBomb;
import attacks.Smokescreen;
import attacks.WaterPulse;


public class Skrelp extends Pokemon {
    public Skrelp(String name, int level) {
        super(name, level);
        double hp = 50;
        double att = 60;
        double def = 60;
        double spAtt = 60;
        double spDef = 60;
        double speed = 30;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.WATER, Type.POISON);
        this.setMove(new SludgeBomb(), new Smokescreen(), new WaterPulse());
    }

    public Skrelp() {
        this("noname", 1);
    }
}
