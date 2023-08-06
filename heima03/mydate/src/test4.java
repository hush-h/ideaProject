import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class test4 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDateTime ldt1 = LocalDateTime.of(2021, 9, 11, 5, 42, 16);
        System.out.println(ldt1);
        System.out.println(ldt.toLocalDate());
        System.out.println(ldt.toLocalTime());
        System.out.println(Period.between(ldt1.toLocalDate(), ldt.toLocalDate()));
        Duration duration = Duration.between(ldt1, ldt);
        System.out.println(duration);
        System.out.println(duration.getSeconds()); //
        System.out.println(ldt1.minusYears(1));

        String s = "2021/09/11 08/57/22";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH/mm/ss");

        System.out.println(ldt.format(dateTimeFormatter));
        System.out.println(LocalDateTime.parse(s, dateTimeFormatter));

    }
}

