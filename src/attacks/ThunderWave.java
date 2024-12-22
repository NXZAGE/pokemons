package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class ThunderWave extends SpecialMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(1).turns(5).condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Thunder Wave";
    }
}
