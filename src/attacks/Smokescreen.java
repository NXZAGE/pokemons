package attacks;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public final class Smokescreen extends StatusMove {
    public Smokescreen() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(1).chance(1).stat(Stat.ACCURACY, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Smokescreen";
    }
}
