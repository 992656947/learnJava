package chapter11.src.com.njwb.sys.enumTest02;

public class PagmentTest {
    public static void main(String[] args) {
        Payment payment = Payment.WEI_XIN;
        switch (payment){
            case WEI_XIN:
                System.out.println("微信支付");
                payment.meaning();
                break;
            case YIN_LIAN:
                System.out.println("银联支付");
                payment.meaning();
                break;
            case ZHI_FU_BAO:
                System.out.println("支付宝支付");
                payment.meaning();
                break;
        }
    }
}
