package session5;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        printDayOfWeek();
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



}
