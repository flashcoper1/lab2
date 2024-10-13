package pokemons;

import moves.happiny.DoubleTeam;
import moves.torkoal.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(100,5,5,15,65,30);

        DoubleTeam doubleTeam = new DoubleTeam(0,100);
        Confide confide = new Confide(0,100);
        super.setMove(doubleTeam,confide);
    }
}
