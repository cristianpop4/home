package session17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface IntSum {
    int sum(int a, int b);
}

@FunctionalInterface
interface IntMultiply {
    int multiply(int a, int b);
}

public class LambdaDemo {
    static void main(String[] args) {
        IntSum resultSum = (a, b) -> a + b;
        System.out.println(resultSum.sum(5, 2));

        IntMultiply resultMultiply = (a, b) -> a * b;
        System.out.println(resultMultiply.multiply(2, 3));
    }
}

@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

class CalculateDemo {
    static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        Calculator multy = (a, b) -> a * b;
        Calculator div = (a, b) -> a / b;

        System.out.println("sum " + sum.compute(2, 3));
        System.out.println("multy " + multy.compute(2, 3));
        System.out.println("div " + div.compute(6,3));
    }
}

@FunctionalInterface
interface GreetingService{
    void great(String msg);
}


class CreatingServicePractice{
    static void main(String[] args) {
        GreetingService anonnymGreeting = new GreetingService() {
            @Override
            public void great(String msg) {
                System.out.println("Hello from " + msg);
            }
        };

        GreetingService lanbdaGreeting = msg -> System.out.println("Hello from " + msg);

        anonnymGreeting.great("anonnye class");
        lanbdaGreeting.great("Lambda expression");
    }
}

class LambdaStandardExample{
    static void main(String[] args) {
        Runnable noParm = () -> System.out.println("hello from runable");
        noParm.run();

        Consumer<String> oneParm = msg -> System.out.println("Hello from " + msg);
        oneParm.accept("consumer");

        List<String> names = new ArrayList<>(List.of("Marcel"));
        Predicate<List<String>> predicate = a -> a.isEmpty();
        System.out.println(predicate.test(names));
    }
}

