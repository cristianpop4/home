package homeworks.session14;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    static void main() {
        System.out.println("Color list: " + colorList());
        iterate();
        List<String> colors = colorList();
        System.out.println("New list: " + updateList(colors, "Blue"));
    }

    private static List<String> colorList(){
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("yellow");
        colors.add("green");
        return colors;
    }

    private static void iterate(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 5; i++)
            list.add(i);
       for (int item : list)
           System.out.println("List item: " + item);
    }

    private static List<String> updateList(List<String> colors, String color){
        List<String> newList = new ArrayList<>(colors);
        newList.addFirst(color);
        return newList;
    }
}