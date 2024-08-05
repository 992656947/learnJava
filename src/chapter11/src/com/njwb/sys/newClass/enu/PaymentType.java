package chapter11.src.com.njwb.sys.newClass.enu;


import com.njwb.design.Target;

public enum PaymentType implements Target {

    ZHI_FU_BAO("支付宝"){
        public void meaning(){
            System.out.println("网上支付 安全快速!");
        }
    },WEI_XIN("微信"){
        public void meaning(){
            System.out.println("微信,是一个生活方式");
        }
    },YIN_LIAN("银联"){
        public void meaning(){
            System.out.println("呵呵");
        }
    };
    //属性
    private String name ;
    //可以定义构造，必须私有化
    private PaymentType(String name){
        this.name = name ;
    }
    //方法
    public String getName() {
        return name;
    }

    @Override
    public void meaning() {
        System.out.println("网上支付..开启未来。。。。");
    }
}
