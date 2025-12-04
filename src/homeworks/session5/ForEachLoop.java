package homeworks.session5;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 12, 54, 55};
        for (int x : array) {
            if (x % 2 == 0) System.out.print(x + " even ");
                else System.out.print(x + " odd ");
        }
    }
}
