package homeworks.session7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class h7 {
    public static void main(String[] args) {
        displayingTodaysDate();
        dateDecomposition("2025.12.11");
        createSpecificDate();
        areDatesEquals();
        isTodaySpecificDate();
        displayCurentTime();
        addWeeksToToday(4);
        findDayOfWeek();
        daysBetween();
    }

    public static void displayingTodaysDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date is: " + localDate);
    }

    public static void dateDecomposition(String date){
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    public static void createSpecificDate(){
        LocalDate date = LocalDate.of(2025, 8 , 19);
        System.out.println(date);
    }

    public static void areDatesEquals(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("introduceti o data (format yyyy-MM-dd):");
        String intput1 = scanner.nextLine();
        System.out.println("introduceti o alta data (format yyyy-MM-dd):");
        String intput2 = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(intput1, formatter);
        LocalDate date2 = LocalDate.parse(intput2, formatter);
        if(date1.isEqual(date2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void isTodaySpecificDate(){
        LocalDate localDate = LocalDate.now();
        String intput = "2019-12-10";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(intput, formatter);
        if (localDate.isEqual(date)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void displayCurentTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public static void addWeeksToToday(int intput){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusWeeks(intput));
    }

    public static void findDayOfWeek(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("introduceti o data (format yyyy-MM-dd):");
        String intput = scanner.nextLine();
        LocalDate date = LocalDate.parse(intput, formatter);
        System.out.println(date.getDayOfWeek());
    }

    public static void daysBetween(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("introduceti o data (format yyyy-MM-dd):");
        LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println("introduceti o alta data (format yyyy-MM-dd):");
        LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);
        LocalDateTime dt1 = date1.atStartOfDay();
        LocalDateTime dt2 = date2.atStartOfDay();
        Duration duration = Duration.between(dt1, dt2);
        System.out.println(duration.toDays());
    }
}
