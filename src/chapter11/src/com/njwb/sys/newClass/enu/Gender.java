package chapter11.src.com.njwb.sys.newClass.enu;

public class  Gender {

    private String sex ;

    private  Gender() {}

    public Gender(String sex) {
        this.sex = sex;
    }

    public static final Gender MALE = new Gender("男");
    public static final Gender FEMALE = new Gender("女");






}
