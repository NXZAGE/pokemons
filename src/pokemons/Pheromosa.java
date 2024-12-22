package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.Rest;
import attacks.LeachLife;
import attacks.MegaPunch;
import attacks.PowerUpPunch;

public final class Pheromosa extends Pokemon {
    public Pheromosa (String name, int level) {
        super(name, level);
        double hp = 71;
        double att = 137;
        double def = 37;
        double spAtt = 137;
        double spDef = 37;
        double speed = 151;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.BUG, Type.FIGHTING);
        this.setMove(new Rest(), new LeachLife(), new MegaPunch(), new PowerUpPunch());
    }

    public Pheromosa() {
        this("noname", 1);
    }
}