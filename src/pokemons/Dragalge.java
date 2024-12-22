package pokemons;
import ru.ifmo.se.pokemon.Type;
import attacks.Twister;

public final class Dragalge extends Skrelp {
    public Dragalge(String name, int level) {
        super(name, level);
        double hp = 65;
        double att = 75;
        double def = 90;
        double spAtt = 97;
        double spDef = 123;
        double speed = 44;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.addType(Type.DRAGON);
        this.addMove(new Twister());
    }

    public Dragalge() {
        this("noname", 1);
    }
}
