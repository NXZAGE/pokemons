package pokemons;

import attacks.CrushClaw;

public final class Elektross extends Elektrik {
    public Elektross(String name, int level) {
        super(name, level);
        double hp = 85;
        double att = 115;
        double def = 80;
        double spAtt = 105;
        double spDef = 80;
        double speed = 50;
        this.setStats(hp, att, def, spAtt, spDef, speed);
        this.addMove(new CrushClaw());
    }

    public Elektross() {
        this("noname", 1);
    }
}
