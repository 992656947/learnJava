package chapter11.src.com.njwb.sys.Test;

public class PayType {
    private String typeName;

    public PayType(String typeName) {
        this.typeName = typeName;
    }

    public static final PayType WEI_XIN = new PayType("微信");
    public static final PayType ZHI_FU_BAO = new PayType("支付宝");
    public static final PayType YIN_LIAN = new PayType("银联");

}
