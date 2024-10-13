package moves.torkoal;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(double pow,double accuracy){
        super(Type.POISON,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected void applyOppEffects(Pokemon opponent) {
        super.applyOppEffects(opponent);
        if (lab2.Program.chance(0.3)){
            Effect.poison(opponent);
        }
    }
}
