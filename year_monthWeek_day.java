public class year_monthWeek_day {
    public static void main(String[] args){
        int days=1500;

        int year=days/365;
        System.out.println("total years: "+ year);

        int rem=days%365;

        int month=rem/30;
        System.out.println("total months: "+ month);

        int rem2=rem%30;

        int week=rem2/7;
        System.out.println("total weeks: " + week);

        int day=rem2%7;
         System.out.println("total days: " + day);

    }
    
}
