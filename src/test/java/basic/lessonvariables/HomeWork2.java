package basic.lessonvariables;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HomeWork2 {
    @Test
    public void showUserInfo(){
        String name = "Alena";
        String surname = "Mirskaya";
        int age = 32;
        String birthday = "1992-06-14";
        String mail = "test@gmail.com";
        char gender = 'F';
        boolean isCar = true;
        String personalCode = "4535";
        String address = "Warszawa, ul. Strumykowa 6B";
        double height = 174.2;
        double weight = 64.4;
        System.out.println("Hi, my name is " + name + " and Im " + age + ". My birthday is " + birthday + ".");

        LocalDate dateBirthday = LocalDate.parse(birthday);
        LocalDate today = LocalDate.now();
        long ageInDays = ChronoUnit.DAYS.between(dateBirthday, today);
        System.out.println(ageInDays);
    }
}








