import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;

public class App {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pheromosa("феромоза", 10);
        Pokemon p2 = new Skrelp("конек", 10);
        Pokemon p3 = new Dragalge("дракоша", 10);
        Pokemon p4 = new Tynamo("розетка", 10);
        Pokemon p5 = new Elektrik("электроконек", 10);
        Pokemon p6 = new Elektross("электродракоша", 10);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addFoe(p2);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
