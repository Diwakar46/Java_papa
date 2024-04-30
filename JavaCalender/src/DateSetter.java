import  java.util.*;
public class DateSetter {
    Calendar calendar =  Calendar.getInstance();
    void dateSetter(int nowYear,int nowMonth ,int nowDayOfMonth,int nowTimeInHour,int nowTimeInMinute,int nowTimeInSecond ){
        calendar.set(nowYear,nowMonth,nowDayOfMonth,nowTimeInHour,nowTimeInMinute,nowTimeInSecond);
        System.out.println("NowTime : " + calendar.getTime());
        System.out.println("NowDay : "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("NowMonth : " + calendar.get(Calendar.MONTH));
        System.out.println("NowDayOfMonth : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("NowYear : " + calendar.get(Calendar.YEAR));
    }

}
