package moves.happiny;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(double pow,double accuracy){
        super(Type.NORMAL,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected void applySelfEffects(Pokemon opponent) {
        super.applySelfEffects(opponent);
        Effect effect = new Effect().stat(Stat.EVASION,1);
    }
}
