package basic.lessonvariables;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class HomeWork2Part2 {
    @Test
    public void task5() {
        String price = "15.30";
        String currency = "EUR";
        BigDecimal totalPrice = new BigDecimal(price);

        System.out.println("Total price is:" + price + currency);
        // System.out.println("Total price is: " + totalPrice + " " + currency)
        System.out.println("Total price is: " + totalPrice + currency);
        System.out.println("Total price is: " + totalPrice + " " + currency);
    }

    @Test
    public void task6() {
        String prefix = "Is that your email address?";
        String address = "test@test.lv";
        String postfix = "recieved";
        String end = "days ago";
        String days = "33"; //такую инфу лучше записывать как int, это число дней и логичнее использовать int

        System.out.println(prefix + address + postfix + Integer.parseInt(days) + end);
    }

    @Test
    public void task7() {
        String prefix = "You passed";
        String distance = "7.5";
        String postfix = "km";

        System.out.println(prefix + " " + Integer.parseInt(distance) + " " + postfix);
        // выдаст ошибку тк 7.5 - это строка в формате дробного числа и ее нельяз преобразовать в целое (int)
        // если хочется что-то сконвертировать, то можно таким образом double.parseDouble(distance)
    }

    @Test
    public void task8() {
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629"); //когда нужно взять за основу не текущую, а какую-то прошедшую или будущую дату и время
        dateTime = dateTime.plusYears(3).plusDays(13).plusMinutes(15);
        System.out.println(dateTime.getDayOfMonth() + dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE) + dateTime.getYear());
    }

    @Test
    public void task9() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");

        DateTimeFormatter frontendFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime frontendDateTime = LocalDateTime.parse("2022/12/24 00:00", frontendFormatter);
        System.out.println(frontendDateTime.format(formatter));
    }

    @Test
    public void task10() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }

    @Test
    public void task11() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
