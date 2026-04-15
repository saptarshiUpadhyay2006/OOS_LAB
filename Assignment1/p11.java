import java.util.*;
class Date{
    private int day;
    private int month;
    private int year;
    public Date(){
        this(01,01,1970);
    }
    public Date(int day){
        this(day,01,1970);
    }
    public Date(int day,int month){
        this(day,month,1970);
    }
    public Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public void printDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
    public void getNextDay(){
        day++;
        if(day>daysInMonth(month,year))
        {
            day=1;
            month++;
            if(month>12)
            {
                year++;
                month=1;
            }
        }
    }

    public void getPreviousDay(){
        day--;
        if(day<1)
        {
            month--;
            if(month<1)
            {
                month=12;
                year--;
            }
            day=daysInMonth(month,year);
        }
    }

    private int daysInMonth(int month,int year)
    {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year)?29:28;
            default:
                return 30;
        }
    }
    private boolean isLeapYear(int year) {
        return (year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0);
    }
}

class p11{
    public static void main(String[] args) {
        Date d=new Date();
        d.printDate();
        d.getNextDay();
        d.printDate();
        d.getPreviousDay();
        d.printDate();
        Date d2=new Date(15,4,2025);
        d2.printDate();
        d2.getNextDay();
        d2.printDate();
    }
}