package chapter01.src.com.new7_16.HomeWork02;

public abstract class Doctor {
    private String name;
    private String idNumber;
    private String address;
    public Doctor(String name,String idNumber,String address){
        this.address = address;
        this.idNumber = idNumber;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getIdNumber(){
        return this.idNumber;
    }
    public String getAddress(){
        return this.address;
    }
    public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public abstract void introduce();
}
