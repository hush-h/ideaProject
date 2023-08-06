import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat slf = new SimpleDateFormat("yyyy-mm-dd");
        System.out.println(slf.format(date));
        String s = "2023-01-05";
        SimpleDateFormat slf1 = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = slf1.parse(s);
        System.out.println(date1);
        System.out.println(Long.MAX_VALUE);
    }
}
