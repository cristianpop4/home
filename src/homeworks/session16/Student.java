package homeworks.session16;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int studentId;
    private String email;

    public Student(String name, int age, int studentId, String email) {
        this.age = age;
        this.email = email;
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }
}

class MainStudent{
    static void main(String[] args) {
        Student s1 = new Student("student", 18, 75, "abc@gmail.com");
        Student s2 = new Student("student", 18, 76, "abc@gmail.com");

        System.out.println(s1.equals(s2));
        if (s1.hashCode() == s2.hashCode())
            System.out.println(s1.hashCode());
        else System.out.println("The hashCode is not the same");
    }
}