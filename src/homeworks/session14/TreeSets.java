package homeworks.session14;

import java.util.TreeSet;

public class TreeSets {
    static void main(String[] args) {
        System.out.println("TreeSet: " + treeSet());
        itereate();
        reverseTreeSet();
        firstLast();
        numberOfElemnets();
        lessThen(7);
        remove(5);
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

    private static void numberOfElemnets(){
        TreeSet<String> treeSet = treeSet();
        System.out.println(treeSet.size());
    }

    private static TreeSet<Integer> treeSet1(){
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1 ; i <= 10 ; i++)
            treeSet.add(i);
        return treeSet;
    }

    private static void lessThen(int x){
        TreeSet<Integer> treeSet = treeSet1();
        for (int item : treeSet){
            if (item < x)
                System.out.println("The number" + item);
        }
    }

    private static void remove(int x){
        TreeSet<Integer> treeSet = treeSet1();
        treeSet.remove(x);
        System.out.println(treeSet);
    }
}
