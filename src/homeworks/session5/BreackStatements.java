package homeworks.session5;

import java.util.Scanner;

public class BreackStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true){
            System.out.println("Introdu un numar: ");
            double number = scanner.nextDouble();
            if (number == 0){
                break;
            }
            sum+=number;
            count++;
        }
        if (count > 0){
            double avrage = sum / count;
            System.out.println("Media numerelor este: " + avrage);
        } else System.out.println("Nu ai introdus niciun numar");
    }
}
