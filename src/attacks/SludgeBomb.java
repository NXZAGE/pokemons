package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public final class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 1);
    }

    @Override 
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.3).turns(3).condition(Status.POISON);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Sludge Bomb";
    }
}
