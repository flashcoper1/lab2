package pokemons;

import moves.diglett.EarthPower;
import moves.diglett.MudBomb;
import moves.diglett.Scratch;
import moves.dugtrio.NightSlash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dugtrio extends Pokemon {
    public Dugtrio(String name, int level) {
        super(name, level);

        super.setType(Type.GROUND);
        super.setStats(35,100,50,50,70,120);

        EarthPower earthPower = new EarthPower(90,100);
        Scratch scratch = new Scratch(40,100);
        MudBomb mudBomb = new MudBomb(65,85);
        NightSlash nightSlash = new NightSlash(70,100);
        super.setMove(earthPower,scratch,mudBomb,nightSlash);

    }
}
