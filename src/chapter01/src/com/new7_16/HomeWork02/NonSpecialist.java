package chapter01.src.com.new7_16.HomeWork02;

public class NonSpecialist extends Doctor {
    public NonSpecialist(String name,String idNumber,String address){
        super(name,idNumber,address);
    }
    public void introduce(){
        System.out.println("姓名：" + super.getName() + "\t编号："+super.getIdNumber()+"\t家庭住址："+super.getAddress());
    }
}
