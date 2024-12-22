package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public final class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 0.9);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().chance(0.7).turns(-1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
