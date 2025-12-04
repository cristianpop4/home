package homeworks.session5;

import java.util.Scanner;

public class JunpStatements {
    public static void main(String[] args) {
        int choice;
        boolean optiune = true;
        String name = null;
        while (optiune) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("Alege o optiune:");
            System.out.println("1. Print: Hello world");
            System.out.println("2. Introdu user's name");
            System.out.println("3. Print user's name");
            System.out.println("4. Exit");
            System.out.println("Alege optiunea: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1 -> System.out.println("Hello world");
                case 2 -> {
                    System.out.println("Introdu user's name");
                    name = scanner.nextLine();
                    System.out.println("User's name salvat");
                }
                case 3 ->{
                    if (name != null) {
                        System.out.println("User's name-ul tau este: " + name);
                    } else {
                        System.out.println("Nu ai introdus user's name");
                    }
                }
                case 4 -> {
                    System.out.println("Exit");
                    optiune = false;
                }
                default -> System.out.println("Optiune invalida!");
            }
        }
    }
}
