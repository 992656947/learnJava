package chapter11.src.com.njwb.sys.newClass.game;

public enum  HardGrade {


    SIMPLE(LevelParam.LEVELS_SIMPLE),MIDDLE(LevelParam.LEVELS_MIDDLE),HARD(LevelParam.LEVELS_HARD);

    private  Level[] LEVELS;


    HardGrade(Level[] LEVELS) {
        this.LEVELS = LEVELS;
    }

    public Level[] getLEVELS() {
        return LEVELS;
    }
}
