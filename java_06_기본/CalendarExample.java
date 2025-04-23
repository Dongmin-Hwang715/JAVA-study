package java_06_기본;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);
        int week = now.get(Calendar.DAY_OF_WEEK);
        char weekday = " 일월화수목금토".charAt(week);

        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        String AM_PM = null;
        if (now.get(Calendar.AM_PM) == Calendar.AM) {
            AM_PM = "오전";
        } else {
            AM_PM = "오후";
        }

        System.out.println(year + "년 " + month + "월 " + day + "일");
        System.out.println(weekday + "요일 " + AM_PM);
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}
