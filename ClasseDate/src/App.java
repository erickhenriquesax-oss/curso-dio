import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        var date = new Date();
        var date1 = new Date(System.currentTimeMillis() - 99999999999L);
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println(date);
        System.out.println(formatter.format(date));
        System.out.println(formatter.format(date1));
        date.setHours(15);
        date.setYear(99);
        System.out.println(formatter.format(date));
    }
}
