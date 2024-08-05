package chapter11.src.com.njwb.sys.enumTest02;

public enum  Payment implements Target{
    ZHI_FU_BAO("支付宝"){
        public void meaning(){
            System.out.println("支付宝...");
        }
    },WEI_XIN("微信"){
        public void meaning(){
            System.out.println("微信...");
        }
    },YIN_LIAN("银联"){
        public void meaning(){
            System.out.println("银联...");
        }
    };
    private String name;
    private Payment(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void meaning() {
        System.out.println("网上支付，开启未来。。。。");
    }
}
