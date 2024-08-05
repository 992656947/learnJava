package AllHomeWork.src.com.HomeWork7_22_2;


import java.util.Date;


public class MyCalendar {
        public static void main(String[] args) {
            try {
                // 获取当前日期
                Date currentDate = Tools.getCurrentDate();
                System.out.println("当前日期: " + currentDate);

                // 获取当前短日期格式
                String currentShortDate =Tools.getCurrentShortDate();
                System.out.println("当前年月日格式日期: " + currentShortDate);

                // 获取当前日期和时间
                String currentDateTime = Tools.getCurrentDateTime();
                System.out.println("当前日期和时间: " + currentDateTime);

                // 获取当前中文日期格式
                String currentChineseDate = Tools.getCurrentChineseDate();
                System.out.println("当前中文日期格式: " + currentChineseDate);

                // 将字符串日期转换为日期类型
                String dateStr = "2024-07-22";
                Date date =Tools.convertToDate(dateStr);
                System.out.println("转换后的日期: " + date);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }



