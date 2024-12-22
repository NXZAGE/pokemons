package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public final class AcidSpray extends SpecialMove {
    public AcidSpray() {
        super(Type.POISON, 40, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(3).chance(1).stat(Stat.SPECIAL_DEFENSE, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Acid Spray";   
    }
}
