package homeworks.session17;

import homeworks.session16.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterIntegers {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println("Even numbers: " + numbers);
    }
}

class FilterString {
    static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("b", "a", "d", "c", "e"));

        strings.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted Strings: " + strings);
    }
}

class Sum {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 15));

        final int[] sum = {0};
        numbers.forEach(n -> sum[0] += n);

        System.out.println("Sum: " + sum[0]);
    }
}

class SortedStrings {
    static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("b", "a", "d", "c", "e"));

        strings.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted Strings: " + strings);

        strings.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Soeted: " + strings);
    }
}

@FunctionalInterface
interface Max {
    int findMax(List<Integer> numbers);
}

class MaxNumber {
    static void main(String[] args) {
        Max max = numbers -> ((numbers.isEmpty() || numbers == null) ? 0 : Collections.max(numbers));

        System.out.println("Max: " + max.findMax(List.of(1, 10, 45, 3534)));
    }
}

@FunctionalInterface
interface MaxLength {
    int compare(String a, String b);
}

class Length {
    static void main(String[] args) {
        MaxLength maxLength = (a, b) -> (a.length() < b.length()) ? b.length() : a.length();

        System.out.println("Max length: " + maxLength.compare("red", "purple"));
    }
}

@FunctionalInterface
interface First {
    String firstN(String string, int number);
}

class FirstElements {
    static void main(String[] args) {
        First first = ((string, number) -> (number > string.length()) ? string : string.substring(0, number));

        System.out.println(first.firstN("abcdefg", 3));
    }
}

@FunctionalInterface
interface ListMapper {
    List<Integer> mapList(List<Integer> list, Function<Integer, Integer> function);
}

class MapListDemo {
    static void main(String[] args) {
        ListMapper listMapper = (list, function) -> {
            List<Integer> result = new ArrayList<>();
            list.forEach(n -> result.add(function.apply(n)));
            return result;
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squared = listMapper.mapList(numbers, n -> n * n);
        System.out.println("Squared: " + squared);
    }
}

@FunctionalInterface
interface IntegerLists {
    List<Integer> filter(List<Integer> list1);
}

class IntegerListsDemo {
    static void main(String[] args) {
        IntegerLists integerLists = list1 -> {
            List<Integer> result = new ArrayList<>();
            for (Integer n : list1) {
                if (n % 2 != 0) {
                    result.add(n);
                }
            }
            return result;
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> oddNumbers = integerLists.filter(numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}

@FunctionalInterface
interface NameFormatter {
    List<String> format(List<String> names);
}

class FirstNames{
    static void main(String[] args) {
        NameFormatter nameFormatter = names -> {
            List<String> result = new ArrayList<>();
            for (String name: names){
                result.add(name.toUpperCase());
            }
            return result;
        };

        List<String> list = List.of("Marcel", "Marcela");
        List<String> outputList = nameFormatter.format(list);
        System.out.println(outputList);
    }
}

@FunctionalInterface
interface IsInList<T>{
    boolean isIn(List<T> list, T element);
}

class IsInListDemo{
    static void main(String[] args) {
        IsInList isInList = (list, element) -> (list.contains(element) ? true : false);

        List<String> list = List.of("red", "yellow", "green");
        String item = "red";

        System.out.println(isInList.isIn(list, item));
    }
}

@FunctionalInterface
interface StringJoiner{
    String join(String a, String b);
}

class StringJoinerMain{
    static void main(String[] args) {
        StringJoiner joiner = (a, b) -> a + " " + b;

        System.out.println(joiner.join("Hello", "world"));
    }
}

@FunctionalInterface
interface SquareRoot{
    double apply(double item);
}

class SquareRootMain{
    static void main(String[] args) {
        SquareRoot squareRoot = item -> Math.sqrt(item);

        System.out.println(squareRoot.apply(9));
    }
}

@FunctionalInterface
interface PairMarker<T, U>{
    Pair<T, U> make(T first, U second);
}

class Pair1<T, U>{
    private T first;
    private U second;

    public Pair1(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class PairMain{
    static void main(String[] args) {
        PairMarker<String, Integer> pairMarker = (first, second) -> new Pair<>(second, first);
        Pair<String, Integer> pair = pairMarker.make("Age", 17);
        System.out.println(pair);
    }
}

@FunctionalInterface
interface ListFilter<T>{
    List<T> filter(List<T> list, Predicate<T> predicate);
}

class ListFilterMain{
    static void main(String[] args) {
        ListFilter<Integer> listFilter = (list, predicate) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer x : list){
                if (predicate.test(x)){
                    result.add(x);}
            }
            return result;
        };

        List<Integer> numbers = List.of(5, 12, 3, 20, 8, 15);
        List<Integer> filteredNumbers = listFilter.filter(numbers, x -> x > 10);
        System.out.println(filteredNumbers);
    }
}