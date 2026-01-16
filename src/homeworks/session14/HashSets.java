package homeworks.session14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSets {
    static void main(String[] args) {
        System.out.println("HasSet elements: " + add());
        iterate();
        number();
        empty();
        isEmpty();
        convert();
        convertToTree();
        compare();
        common();
    }

    private static HashSet<String> add(){
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");

        set.add("d");
        return set;
    }

    private static void iterate(){
        HashSet<String> strings = add();

        for (String item : strings)
            System.out.println("List items: " + item);
    }

    private static void number(){
        HashSet<String> list = add();
        System.out.println("HashSet size: " + list.size());
    }

    private static void empty(){
        HashSet<String> set = add();
        set.clear();
        System.out.println("Empty HashSet: " + set);
    }

    private static void isEmpty(){
        HashSet<String> set = add();
        System.out.println("Is empty? " + set.isEmpty());
        set.clear();
        System.out.println("Is empty now? " + set.isEmpty());
    }

    private static void convert(){
        HashSet<String> set = add();
        set.toArray();
        System.out.println("To array" + set);
    }

    private static void convertToTree(){
        HashSet<String> set = add();
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet elements: " + treeSet);
    }

    private static void compare(){
        HashSet<String> set = add();
        HashSet<String> set1 = add();
        set.add("e");
        if (set.equals(set1)) System.out.println("are the same");
            else System.out.println("are not the same");
    }

    private static void common(){
        HashSet<String> set = add();
        HashSet<String> set1 = add();
        set.add("e");
        set.retainAll(set1);
        System.out.println("Comon elements: " + set);
    }
}
