import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        var calendar = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z");
        //Date date = calendar.getTime();
        //calendar.setTime(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(1+calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        
        var newCallendar = Calendar.getInstance();
        newCallendar.set(Calendar.HOUR, calendar.get(Calendar.HOUR) +1);

        System.out.println(formatter.format(calendar.getTime()));
    }
}
