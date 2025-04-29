package java_07_심화;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatExample {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar nowCal  = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(now));

        sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(now));

        String AMPMStr = new String[] {"오전", "오후"}[nowCal.get(Calendar.AM_PM)];
        sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.print(sdf.format(now));
        System.out.print(" " + AMPMStr + " ");
        sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(now));

        char day = " 일월화수목금토".charAt(nowCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("오늘은 " + day + "요일");
    }
}
