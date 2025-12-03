package homeworks.session5;

import java.util.Scanner;

public class FibonacciSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu un numar: ");
        int intput = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("primele " + intput + " numere din sirul lui Fibonaci sunt");
        for (int i = 0; i < intput; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
