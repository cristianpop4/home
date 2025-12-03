package homeworks.session5;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int intput = scanner.nextInt();
        int sum = 0;
        while (intput != -1){
            System.out.println("Numarul introdus este gresit!");
            sum += intput;
            System.out.println("introdu alt numar");
            intput = scanner.nextInt();
        }
        if (intput == -1){
            System.out.println("suma numerelor introduse gresit este: " + sum);
        }
    }
}
