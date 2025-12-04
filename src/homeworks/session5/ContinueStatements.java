package homeworks.session5;

import java.util.Scanner;

public class ContinueStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu 10 numere: ");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int intput = scanner.nextInt();
            if (intput <= 5) continue;
            sum += intput;
        }
        System.out.println("Suma numerelor mai mari decat 5 este: " + sum);
    }
}
