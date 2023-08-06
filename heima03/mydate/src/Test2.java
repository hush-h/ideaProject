import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        date.setTime(0l);
        System.out.println(date);
    }
}
