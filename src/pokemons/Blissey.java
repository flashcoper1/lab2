package pokemons;

import moves.blissey.Sing;
import moves.chansey.SeismicToss;
import moves.happiny.DoubleTeam;
import moves.torkoal.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Blissey extends Pokemon {
    public Blissey(String name, int level) {
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(255,10,10,75,135,55);

        Sing sing = new Sing(0,55);
        SeismicToss seismicToss = new SeismicToss(level,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,100);
        Confide confide = new Confide(0,100);
        super.setMove(doubleTeam,confide,seismicToss,sing);
    }
}
