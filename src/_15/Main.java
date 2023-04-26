package _15;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2020,10,25,11,0,0);
        c.set(c.MONTH, 11);
        Date d = c.getTime();
        System.out.println(d);

        Date now = new Date();
        c.setTime(now);
        System.out.println(c.getTime());
//        Date date = new Date();
//        System.out.println(date);
//
//        Calendar calender = Calendar.getInstance();
//        calender.setTime(date);
//        int year = calender.get(calender.YEAR);
//        int month = calender.get(calender.MONTH);
//        int day = calender.get(calender.DAY_OF_MONTH);
//        int hour = calender.get(calender.HOUR);
//        int minute = calender.get(calender.MINUTE);
//        int second = calender.get(calender.SECOND);
//
//        System.out.println(calender);
//        System.out.println(calender.get(calender.YEAR));
    }
}
