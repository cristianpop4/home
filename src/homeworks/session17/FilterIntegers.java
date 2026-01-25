package homeworks.session17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

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
interface Max{
    int findMax(List<Integer> numbers);
}

class MaxNumber{
    static void main(String[] args) {
        Max max = numbers -> ((numbers.isEmpty() || numbers == null) ?  0 : Collections.max(numbers));

        System.out.println("Max: " + max.findMax(List.of(1, 10, 45, 3534)));
    }
}

@FunctionalInterface
interface MaxLength{
    int compare(String a, String b);
}

class Length{
    static void main(String[] args) {
        MaxLength maxLength = (a, b) ->(a.length() < b.length()) ? b.length() : a.length();

        System.out.println("Max length: " + maxLength.compare("red", "purple"));
    }
}

@FunctionalInterface
interface First{
    String firstN(String string, int number);
}

class FirstElements{
    static void main(String[] args) {
        First first = ((string, number) -> (number > string.length()) ? string : string.substring(0, number));

        System.out.println(first.firstN("abcdefg", 3));
    }
}

@FunctionalInterface
interface ListMapper{
    List<Integer> mapList(List<Integer> list, Function<Integer, Integer> function);
}

class MapListDemo{
    static void main(String[] args) {
        ListMapper listMapper = (list, function) ->{
            List<Integer> result = new ArrayList<>(); list.forEach(n -> result.add(function.apply(n))); return result;
        };

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squared = listMapper.mapList(numbers, n -> n * n);
        System.out.println("Squared: " + squared);
    }
}

@FunctionalInterface
interface IntegerLists{
    List<Integer> filter(List<Integer> list1);
}

class IntegerListsDemo{
    static void main(String[] args) {
        IntegerLists integerLists = list1 -> {
          List<Integer> result = new ArrayList<>();
          for (Integer n : list1){
              if (n % 2 != 0){
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






