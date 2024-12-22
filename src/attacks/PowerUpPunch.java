package attacks;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public final class PowerUpPunch extends PhysicalMove {
    public PowerUpPunch() {
        super(Type.FIGHTING, 40, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().turns(1).stat(Stat.ATTACK, 6);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Power-Up Punch";
    }
}
