package AllHomeWork.src.com.HomeWork7_22_3;

public class MyConveter {
    public static void main(String[] args) {
        Tools tools = new Tools();
        try {
//            tools.convertInt("11");
//            tools.convertShort("11");
//            tools.convertDouble("11.111");
//            tools.convertByte("1");
//            tools.convertFloat("11.11");
            System.out.println(tools.convertInt("11"));
            System.out.println( tools.convertShort("11"));
            System.out.println( tools.convertDouble("11.111"));
            System.out.println(   tools.convertByte("1"));
            System.out.println( tools.convertFloat("11.11"));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
