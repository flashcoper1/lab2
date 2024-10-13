package pokemons;

import moves.chansey.SeismicToss;
import moves.happiny.DoubleTeam;
import moves.torkoal.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chansey extends Pokemon {
    public Chansey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(250,5,5,35,105,50);

        SeismicToss seismicToss = new SeismicToss(level,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,100);
        Confide confide = new Confide(0,100);
        super.setMove(doubleTeam,confide,seismicToss);
    }

}
