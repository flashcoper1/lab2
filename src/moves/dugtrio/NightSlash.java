package moves.dugtrio;

import ru.ifmo.se.pokemon.*;

public class NightSlash extends PhysicalMove {
    public NightSlash(double pow,double accuracy){
        super(Type.DARK,pow,accuracy);

    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "ударяет " + pieces[pieces.length - 1];
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if(att.getStat(Stat.SPEED) / 8.0D > Math.random()) {
            System.out.println("Критический удар");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }

}
