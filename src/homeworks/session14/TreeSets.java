package homeworks.session14;

import java.util.TreeSet;

public class TreeSets {
    static void main(String[] args) {
        System.out.println("TreeSet: " + treeSet());
        itereate();
        reverseTreeSet();
        firstLast();
    }

    private static TreeSet<String> treeSet(){
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("purple");
        treeSet.add("green");
        treeSet.add("red");
        return treeSet;
    }

    private static void itereate(){
        TreeSet<String> treeSet = treeSet();
        for (String item : treeSet)
            System.out.println("curent element is: " + item);
    }

    private static void reverseTreeSet(){
        TreeSet<String> treeSet = treeSet();
        TreeSet<String> reverse = (TreeSet<String>) treeSet.descendingSet();
        System.out.println("reversed treeSet: " + reverse);
    }

    private static void firstLast(){
        TreeSet<String> treeSet = treeSet();
        System.out.println("The first element is: " + treeSet.first());
        System.out.println("The last element is: " + treeSet.last());
    }


}
