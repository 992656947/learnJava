package chapter01.src.com.new7_16.HomeWork02;

public class Specialist extends Doctor{
    protected String speciality;
    public Specialist(String name,String idNumber,String address,String speciality){
        super(name,idNumber,address);
        this.speciality=speciality;
    }
    public void introduce(){
        System.out.println("姓名：" + super.getName() + "\t编号："+super.getIdNumber()+"\t家庭住址："+super.getAddress()+"\t专业为："+speciality);
    }
}
