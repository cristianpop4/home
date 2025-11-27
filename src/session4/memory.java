package session4;

import java.util.Objects;

public class memory {
    public static void main(String[] args) {
        String hello1 = "hello";
        String hello2 = "Hello";
        String hello3 = new String("Hello");

        System.out.println(hello1 == hello2);

        System.out.println(hello1.equals(hello2));

        System.out.println(hello2 == hello3);

        System.out.println(hello2.equals(hello3));

        User user1 = new User("Marcel");
        User user2 = new User("Marcel");
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        User user3 = new User("Marcela");
        System.out.println(user2.equals(user3));
    }
}


class User {

    String firstName;

    public User(String name) {
        this.firstName = name;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return firstName.equals(user.firstName);
    }

}
