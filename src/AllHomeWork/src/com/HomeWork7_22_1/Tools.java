package AllHomeWork.src.com.HomeWork7_22_1;

public class Tools {
    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String join(String[] array, String sign) {
        if (array == null || array.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(sign);
            }
        }
        return sb.toString();
    }

}
