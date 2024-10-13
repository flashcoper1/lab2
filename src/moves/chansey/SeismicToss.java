package moves.chansey;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SeismicToss extends PhysicalMove {
    public SeismicToss(double pow,double accuracy){
        super(Type.FIGHTING,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }

}
