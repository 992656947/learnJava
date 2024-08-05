package chapter11.src.com.njwb.sys.newClass.design;

public class PayType {

    private String typeName;

    public static final PayType WEI_XIN = new PayType("微信");
    public static final PayType ZHI_FU_BAO = new PayType("支付宝");
    public static final PayType YIN_LIAN = new PayType("银联");

    //构造器私有化
    private  PayType(String typeName) {
        this.typeName = typeName;
    }

}
