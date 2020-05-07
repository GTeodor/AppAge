package ro.teodor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1960, 6, 16);

        long days = ChronoUnit.DAYS.between(birthDate, now);
        System.out.println("days = " + days);
    }
}
