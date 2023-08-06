import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(0l);
        Date date2 = new Date(3600*1000l);
        System.out.println(date1);
        System.out.println(date2);

    }

}

