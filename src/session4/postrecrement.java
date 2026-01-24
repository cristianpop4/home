package session4;

public class postrecrement {
    public static void main(String[] args) {
        int x = 5;
        int y = x++;
        System.out.println(x);
        System.out.println(y);

        int z = 5;
        int w = ++z;
        System.out.println(z);
        System.out.println(w);

        x = 5;
        y = x--;
        System.out.println(x);
        System.out.println(y);

        z = 5;
        w = --z; // z=z-1; w=z
        System.out.println(z);
        System.out.println(w);

    }
}
