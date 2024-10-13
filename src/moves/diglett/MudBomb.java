package moves.diglett;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb(double pow,double accuracy){
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
        if (lab2.Program.chance(0.3)){
            Effect effect = new Effect().stat(Stat.ACCURACY,-1);
        }
    }
}
