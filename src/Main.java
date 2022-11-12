import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год рождения");
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения");
        int day = scanner.nextInt();
        LocalDate dateBorn = LocalDate.of(year, month, day);
        DayOfWeek aa = dateBorn.getDayOfWeek();
        LocalDate dateAdult = dateBorn.plusYears(18);
        System.out.println("Ваша дата рождения: " + dateBorn);
        System.out.println("Ваша дата совершеннолетия: " + dateAdult);
        System.out.println(aa);
    }
}
