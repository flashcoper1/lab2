package pokemons;

import moves.diglett.EarthPower;
import moves.diglett.MudBomb;
import moves.diglett.Scratch;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diglett extends Pokemon {
    public Diglett(String name, int level) {
        super( name, level );

        super.setType(Type.GROUND);
        super.setStats(10,55,25,35,45,95);

        EarthPower earthPower = new EarthPower(90,100);
        Scratch scratch = new Scratch(40,100);
        MudBomb mudBomb = new MudBomb(65,85);

        super.setMove(earthPower,scratch,mudBomb);

    }
}
