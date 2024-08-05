package chapter01.src.com.new7_17.car;

public class Master {
    private String name;
    public void rentMotos(MotoVehicle[] motos,int day){
        int sum = 0;
        for(int i=0;i<motos.length;i++){
            if (motos[i]!=null){
                sum = sum +motos[i].calcRent(day);
            }
        }
        System.out.println("一共付款："+sum+"元");
    }

}
