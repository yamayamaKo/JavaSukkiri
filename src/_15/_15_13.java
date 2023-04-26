package _15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _15_13 {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date d = f.parse("2020/09/22 01:23:45");
        System.out.println(d);

        Date now = new Date();
        String s = f.format(now);
        System.out.println(s);
    }
}
