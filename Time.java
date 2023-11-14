import java.util.Calendar;
public class Time {
    public static String retTime(){
        Calendar cal = Calendar.getInstance();
        String dateTimeStr = cal.getTime().toString(); 
        return dateTimeStr; 
    }
}
