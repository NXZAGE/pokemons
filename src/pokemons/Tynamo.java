package pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.ChargeBeam;
import attacks.ThunderWave;

public class Tynamo extends Pokemon {
    public Tynamo(String name, int level) {
        super(name, level);
        double hp = 35;
        double att = 55;
        double def = 40;
        double spAtt = 45;
        double spDef = 40;
        double speed = 60;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.setType(Type.ELECTRIC);
        this.setMove(new ChargeBeam(), new ThunderWave());
    }

    public Tynamo() {
        this("noname", 1);
    }
}
