package homeworks.session5;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int a = 0 , b = 1;
        System.out.println("Primele 10 numere din sirul lui fibonacci sunt");
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
