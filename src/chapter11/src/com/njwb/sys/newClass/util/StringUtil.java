package chapter11.src.com.njwb.sys.newClass.util;

public class StringUtil {

    private StringUtil(){}

    //判断字符串是否为空。如果字符串为空，返回true，否则返回false

    public static boolean isEmpty(String str) {
        if(str==null||str.trim().length()==0) {
            return true;
        }else{
            return false;
        }
    }



	//将给定的属性名，转换成其对应getter、setter方法的形式。返回对应的setter和getter方法名。


    public static String getFiledToMethodName(String fieldName,String prefix) {

        if(prefix.equals("get")) {
            return "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        }else if(prefix.equals("set")) {
            return "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        }else{
            return null ;
        }
    }

    //将一个字符串数组，以指定的符号连接起来。返回连接后的字符串
    public static String joinArrayOfJoinStr(String[] array,String join) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0 ; i<array.length;i++) {
            stringBuffer.append(array[i]);
            if(i!=array.length-1) {
                stringBuffer.append(join);
            }
        }
        String finalResult = new String(stringBuffer);
        return finalResult ;
    }



    public int convertInt(String number)  {
        return Integer.parseInt(number);
    }
	public double convertDouble(String number) {
        return Double.parseDouble(number);
    }
	public float convertFloat(String number){
        return Float.parseFloat(number);
    }
	public short convertShort(String number){
        return Short.parseShort(number);
    }
	public byte convertByte(String number) {
        return Byte.parseByte(number);
    }




}
