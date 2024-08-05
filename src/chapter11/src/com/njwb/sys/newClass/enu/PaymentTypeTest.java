package chapter11.src.com.njwb.sys.newClass.enu;


public class PaymentTypeTest {
    public static void main(String[] args) {

        PaymentType paymentType = PaymentType.YIN_LIAN;
        switch (paymentType) {
            case WEI_XIN:
                System.out.println("微信支付。。。。。");
                paymentType.meaning();
                break;
            case YIN_LIAN:
                System.out.println("银联支付...");
                paymentType.meaning();
                break;
            case ZHI_FU_BAO:
                System.out.println("马哥开辟网上购物先河");
                paymentType.meaning();
                break;
        }
    }
}
