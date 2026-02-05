package homeworks.session18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Homework18Demo {
    static void main(String[] args) {
        evenNumbersList();
        longestString();
        concatenationString();
        sumOf();
        stringsLenght();
        vowlesCount();
    }

    private static void evenNumbersList() {
        List<Integer> numbers = List.of(3, 4, 7, 8, 12, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    private static void longestString() {
        List<String> strings = List.of("apple", "banana", "cherry", "date", "elderberry");

        strings.stream()
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);
    }

    private static void concatenationString() {
        List<String> strings = List.of("one", "two", "three", "four");

        String result = strings.stream()
                .reduce("", (a, b) -> a + b);
        System.out.println(result);
    }

    private static void sumOf() {
        Integer[] numbers = {1, 2, 3, 4, 5};

       int sum = Arrays.stream(numbers)
               .reduce(0, Integer::sum);

        System.out.println("Sum of numbers " + sum);
    }

    private static void stringsLenght(){
        List<String> strings = List.of("Hello", "World", "Java", "Streams");

        List<Integer> lenght = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lenght);
    }

    private static void vowlesCount(){
        String string = "Hello world";

        long cnt = string.toLowerCase()
                .chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
        System.out.println("Numbers of vowles" + cnt);
    }

}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class StreamPersonDemo {
    static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person(20, "Alice", "Jhonson"), new Person(17, "Bob", "Smith"));

        List<Person> adultsPeople = people.stream()
                .filter(p -> p.getAge() > 18)
                .toList();

        adultsPeople.forEach(p -> System.out.println(p.getFirstName() + " " + p.getLastName()));
    }
}






