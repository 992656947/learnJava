package com.HomeWork7_22_2;

import java.text.SimpleDateFormat;
import java.util.Date;

//①public static java.uitl.Date getCurrentDate() //取得当前日期
//②public static String getCurrentShortDate () //返回当前年月日格式日 期：yyyy-mm-dd
//③public static String getCurrentDateTime() //取得当前日期和时间 格 式：yyyy-mm-dd hh:mi:ss
//④public static String getCurrentChineseDate() //返回 “yyyy年xx月xx 日”格式的日期
//⑤public static java.util.Date convertToDate(String currentDate) throws Exception
////将字符串日期转换为日期类型， 字符串格式为：yyyy-mm- dd, 如果转换失败，抛出转换异常
public class Tools {
    public static Date getCurrentDate() {
        return new Date();
    }

    public static String getCurrentShortDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(getCurrentDate());
    }

    public static String getCurrentDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(getCurrentDate());
    }

    public static String getCurrentChineseDate(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(getCurrentDate());
    }

    public static Date convertToDate(String currentDate) throws  Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(currentDate);
    }

}
