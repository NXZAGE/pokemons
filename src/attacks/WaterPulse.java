package attacks;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;


public final class WaterPulse extends SpecialMove {
    public WaterPulse() {
        super(Type.WATER, 60, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            p.confuse();
        }
    }

    @Override
    protected String describe() {
        return "использует Water Pulse";
    }
}
