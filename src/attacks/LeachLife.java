package attacks;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Pokemon;

public final class LeachLife extends PhysicalMove {
    public LeachLife() {
        super(Type.BUG, 80, 1);
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {
        pokemon.setMod(Stat.HP, -1 * (int)Math.round(damage*0.5));
    }

    @Override
    protected String describe() {
        return "использует Leach Life";
    }
}
