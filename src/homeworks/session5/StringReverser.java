package homeworks.session5;

import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Introdu un string: ");
        String intput = scanner.nextLine();
        String reversed = new StringBuilder(intput).reverse().toString();
        System.out.println("Stringul reversed este: " + reversed);
    }
}
