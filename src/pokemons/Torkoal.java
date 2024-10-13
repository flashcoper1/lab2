package pokemons;

import moves.torkoal.Confide;
import moves.torkoal.Overheat;
import moves.torkoal.RockSlide;
import moves.torkoal.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Torkoal extends Pokemon {
    public Torkoal(String name, int level) {
        super(name, level);

        super.setType(Type.FIRE);
        super.setStats(70,85,140,85,70,20);

        RockSlide rockSlide = new RockSlide(75,90);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);
        Overheat overheat = new Overheat(130,90);
        Confide confide = new Confide(0,100);
        super.setMove(rockSlide,sludgeBomb,overheat,confide);
    }
}
