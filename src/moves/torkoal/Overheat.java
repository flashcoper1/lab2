package moves.torkoal;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(double pow,double accuracy){
        super(Type.FIRE,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected void applySelfEffects(Pokemon opponent) {
        super.applySelfEffects(opponent);
        Effect e  = new Effect().stat(Stat.SPECIAL_ATTACK,-2);
    }
}
