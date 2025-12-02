package session5;

import java.util.Scanner;

public class SwitchStatements {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY =3;
    public static final int THURSDAY = 4;
    public static final int FRAIDAY = 5;


    public static void main(String[] args) {
//        Scanner intput = new Scanner(System.in);
//        int valoare = intput.nextLine();

//            printDayOfWeek();
       printDayOfweekSimpleEdition();
//       printGrade();
//        printDayOfweekSimpleEdition(valoare);
    }

    private static void printDayOfWeek(){
        Scanner intput = new Scanner(System.in);
        System.out.println("Introdu ziua:");
        String day = intput.nextLine();

        switch (day){
            case "Monday":
                System.out.println("is it Monday?");
                System.out.println("today is Monday");
                break;
            case "Tuesday":
                System.out.println("today is Tuesday");
                break;
            case "Wednesday":
                System.out.println("today is Wensdesday");
                break;
            case "Thursday":
                System.out.println("today is Thursday");
                break;
            default:
                System.out.println("weekend");
        }
    }
    private static void printDayOfweekSimpleEdition(){
        Scanner intput = new Scanner(System.in);
        System.out.println("Inserati de la 1-5 numarul zilei");
        int day = intput.nextInt();

        switch (day){
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRAIDAY -> {
                System.out.println("Fraiday");
                System.out.println("is it?");
            }
            default -> System.out.println("probabil weekend");
        }
    }

    private static void printGrade(){
        Scanner intput = new Scanner(System.in);
        System.out.println("Inserati o nota de la A la D");
        char grade = intput.nextLine().toUpperCase().charAt(0);

        switch (grade){
            case 'A'-> System.out.println("Bravo");
            case 'B' -> System.out.println("almost");
            case 'C' -> System.out.println("good");
            case 'D' -> System.out.println("bad");
            default -> System.out.println("eroare la citire");
        }
    }


}
