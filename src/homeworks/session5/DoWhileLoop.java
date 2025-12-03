package homeworks.session5;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number: ");
        int intput = scanner.nextInt();
        do{
            if (intput > 4){
                System.out.println("too high");
                System.out.println("try again");
                intput = scanner.nextInt();
            }
            if (intput < 4){
                System.out.println("too low");
                System.out.println("try again");
                intput = scanner.nextInt();
            }
        } while (intput != 4);
        if (intput == 4){
            System.out.println("Yoy guess it");
        }
    }
}
