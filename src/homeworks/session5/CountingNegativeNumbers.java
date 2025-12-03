package homeworks.session5;

import java.util.Scanner;

public class CountingNegativeNumbers {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);

        int[] array = {-1, -34, 34, -35, 2, 56, 89};
        int cnt = 0;
        for (int i : array) {
            if (i < 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
