package moves.torkoal;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(double pow,double accuracy){
        super(Type.NORMAL,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected void applyOppEffects(Pokemon opponent) {
        super.applyOppEffects(opponent);
        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK,-1 );
    }
}
