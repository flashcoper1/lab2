package moves.diglett;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    public EarthPower(double pow,double accuracy){
        super(Type.GROUND,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected void applyOppEffects(Pokemon opponent) {
        super.applyOppEffects(opponent);
        if (lab2.Program.chance(0.1)){
            Effect effect = new Effect().stat(Stat.SPECIAL_DEFENSE,-1);
        }
    }
}
