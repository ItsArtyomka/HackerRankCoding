package org.artyomka.HackerRank.Introduction;

    import java.time.LocalDate;
    import java.util.Scanner;

public class JavaDateTime {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        // Output
        if (year < 3000 && year > 2000) {
            System.out.println(findDay(month, day, year));
        }
    }

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        return localDate.getDayOfWeek().toString();
    }
}
