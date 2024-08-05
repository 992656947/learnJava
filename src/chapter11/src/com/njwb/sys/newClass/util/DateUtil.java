package chapter11.src.com.njwb.sys.newClass.util;

import com.njwb.util.ex.DateConvertException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil(){}
    private static final String  SHORT_FORMAT_DATE= "yyyy-MM-dd";
    private static final String  STANDARD_FORMAT_DATE="yyyy-MM-dd HH:mm:ss";
    ////取得当前日期
    public static Date getCurrentDate() {
        return new Date();
    }
    //获取当前日期的短格式
	public static String getCurrentShortDate ()  {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.SHORT_FORMAT_DATE);
        return simpleDateFormat.format(getCurrentDate());
    }
    //获取指定日期的短格式
    public static String getCurrentShortDate (Date date)  {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.SHORT_FORMAT_DATE);
        return simpleDateFormat.format(date);
    }

	public static String getStandardDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.STANDARD_FORMAT_DATE);
        return simpleDateFormat.format(getCurrentDate());
    }

    public static String getStandardDateTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtil.STANDARD_FORMAT_DATE);
        return simpleDateFormat.format(date);
    }


    public static String getCurrentChineseDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        return simpleDateFormat.format(getCurrentDate());
    }
    public static String getCurrentChineseDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        return simpleDateFormat.format(date);
    }



	public static Date convertToDate(String currentDate) throws DateConvertException {
        SimpleDateFormat simpleDateFormat  = new SimpleDateFormat(DateUtil.SHORT_FORMAT_DATE);
        try {
            return simpleDateFormat.parse(currentDate);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new DateConvertException("格式必须是yyyy-MM-dd",e);
        }
    }




    public static void main(String[] args) {
        System.out.println(DateUtil.getCurrentChineseDate());
        System.out.println(DateUtil.getCurrentChineseDate(new Date()));

        try {
            System.out.println(DateUtil.convertToDate("aa"));
        } catch (DateConvertException e) {
           //
            System.out.println("格式不合法");
        }
    }

}
