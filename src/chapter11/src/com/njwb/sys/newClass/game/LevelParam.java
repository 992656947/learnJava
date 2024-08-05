package chapter11.src.com.njwb.sys.newClass.game;

public class LevelParam {

    //配置
    public static final Level[] LEVELS = new Level[7];


    public static final Level[] LEVELS_SIMPLE = new Level[7];


    public static final Level[] LEVELS_MIDDLE = new Level[7];


    public static final Level[] LEVELS_HARD = new Level[7];


    //自行定义即可。
    static{
        LEVELS[0] = new Level(1,2,2,12,30);
        LEVELS[1] = new Level(2,3,4,11,28);
        LEVELS[2] = new Level(3,4,6,10,22);
        LEVELS[3] = new Level(4,5,8,9,20);
        LEVELS[4] = new Level(5,6,10,8,18);
        LEVELS[5] = new Level(6,7,12,7,16);
        LEVELS[6] = new Level(7,8,14,6,10);


        LEVELS_SIMPLE[0] = new Level(1,2,2,12,30);
        LEVELS_SIMPLE[1] = new Level(2,3,4,11,28);
        LEVELS_SIMPLE[2] = new Level(3,4,6,10,22);
        LEVELS_SIMPLE[3] = new Level(4,5,8,9,20);
        LEVELS_SIMPLE[4] = new Level(5,6,10,8,18);
        LEVELS_SIMPLE[5] = new Level(6,7,12,7,16);
        LEVELS_SIMPLE[6] = new Level(7,8,14,6,10);


        LEVELS_MIDDLE[0] = new Level(1,2,2,12,30);
        LEVELS_MIDDLE[1] = new Level(2,3,4,11,28);
        LEVELS_MIDDLE[2] = new Level(3,4,6,10,22);
        LEVELS_MIDDLE[3] = new Level(4,5,8,9,20);
        LEVELS_MIDDLE[4] = new Level(5,6,10,8,18);
        LEVELS_MIDDLE[5] = new Level(6,7,12,7,16);
        LEVELS_MIDDLE[6] = new Level(7,8,14,6,10);


        LEVELS_HARD[0] = new Level(1,2,2,12,30);
        LEVELS_HARD[1] = new Level(2,3,4,11,28);
        LEVELS_HARD[2] = new Level(3,4,6,10,22);
        LEVELS_HARD[3] = new Level(4,5,8,9,20);
        LEVELS_HARD[4] = new Level(5,6,10,8,18);
        LEVELS_HARD[5] = new Level(6,7,12,7,16);
        LEVELS_HARD[6] = new Level(7,8,14,6,10);
    }

}
