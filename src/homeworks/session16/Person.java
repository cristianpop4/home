package homeworks.session16;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(int age, String email, String name) {
        this.age = age;
        this.email = email;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class MainPerson{
    static void main(String[] args) {
        Person p1 = new Person(20, "abc@gmail.com", "Marcel");
        Person p2 = new Person(20, "abcd@gmail.com", "Marcel");

        System.out.println(p2.equals(p1));
        if (p1.hashCode() == p2.hashCode())
            System.out.println(p1.hashCode());
        else System.out.println("The hashCode is not the same");
    }
}