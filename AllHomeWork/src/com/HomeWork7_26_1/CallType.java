package com.HomeWork7_26_1;

public enum CallType {
    INTER_NATIONAL("国际长途",10),PROVINCE("省内漫游",2),CITY("市话",1);
    private  int price;
    private String name;
    private CallType(String name,int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
