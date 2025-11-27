package session4;

public class memory {
    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = "Hello";
        String hello3 = new String("Hello");

        System.out.println(hello1 == hello2);

        System.out.println(hello1.equals(hello2));

        System.out.println(hello2 == hello3);

        System.out.println(hello2.equals(hello3));


    }
}
