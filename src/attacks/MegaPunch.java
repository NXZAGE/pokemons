package attacks;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class MegaPunch extends PhysicalMove {
    public MegaPunch() {
        super(Type.NORMAL, 80, 0.85);
    }

    @Override
    protected String describe() {
        return "использует Mega Punch";
    }
}
