import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Calendar calendar =  Calendar.getInstance();
    DateSetter dateSet = new DateSetter();
        System.out.println("Time : " + calendar.getTime());
        System.out.println("Day : "+ calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Month : " + calendar.get(Calendar.MONTH));
        System.out.println("DayOfMonth : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Year : " + calendar.get(Calendar.YEAR) + "\n");
        dateSet.dateSetter(1992,2,14,2,14,40);
        }
    }
