package pokemons;
import attacks.AcidSpray;

public class Elektrik extends Tynamo {
    public Elektrik(String name, int level) {
        super(name, level);
        double hp = 65;
        double att = 85;
        double def = 70;
        double spAtt = 75;
        double spDef = 70;
        double speed = 40;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.addMove(new AcidSpray());
    }

    public Elektrik() {
        this("noname", 1);
    }
}
