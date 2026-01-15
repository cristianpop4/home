package session14;

import java.util.*;

public class CollectionDemo {

    static void main(String[] args) {
        ListDemo();
        SetDemo();
        mapDemo();
    }

    private static void ListDemo() {
        System.out.println("List demo \n");

        List<Integer> numbers = initializeList();
        System.out.println("Numbers list: " + numbers);
        List<Integer> newNumbers = updateList(numbers, 11, 500);
        System.out.println("NewNumbers list " + newNumbers);
        System.out.println("is number 500 in lisr?: " + isElementPresent(newNumbers, 500));
    }

    private static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> updateList(List<Integer> numbers, int index, int value) {
//        numbers.set(index, value);
//        return numbers;
        if (index < 0 || index >= numbers.size()) {
            System.out.println("Invalid index: " + index);
            return numbers;
        }

        List<Integer> newList = new ArrayList<>(numbers);
        newList.set(index, value);
        return newList;
    }

    private static boolean isElementPresent(List<Integer> list, int value) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) == value) return true;
//        }
//        return false;

        return list.contains(value);
    }

    // Set demo
    private static void SetDemo(){
        System.out.println("\n Set demo \n");

        zileleSaptamanii();

        hasSetDemo();
    }

    private static void hasSetDemo(){
        Set<String> hasSet = new HashSet<>();
        hasSet.add("A");
        hasSet.add("B");
        hasSet.add("C");
        System.out.println("HasSet: " + hasSet);
        hasSet.add("A");
        hasSet.add("D");
        hasSet.remove("B");
        System.out.println("HasSet: " + hasSet);
    }

    private static void zileleSaptamanii(){
        EnumSet<ZiuaSaptamani> zile = EnumSet.range(
                ZiuaSaptamani.LUNI,
                ZiuaSaptamani.MIERCURI
        );

        System.out.println("EnumSet " + zile);

        zile.add(ZiuaSaptamani.JOI);
        zile.add(ZiuaSaptamani.VINERI);

        System.out.println("EnumSet " + zile);

        zile.add(ZiuaSaptamani.VINERI);

        System.out.println("EnumSet " + zile);
    }

    enum ZiuaSaptamani{
        LUNI, MARTI, MIERCURI, JOI, VINERI;
    }

//       Map demo

    private static void mapDemo(){
        System.out.println("\n Map demo \n");

        Map<String, Integer> students = initializerMap();
        System.out.println("students Map: " + initializerMap());

        updateMap(students, "Marcel", 41);
        updateMap(students, "Marcela", 42);
        System.out.println("students Map after update: " + students);

//        System.out.println(students.get("Marcel"));
        System.out.println("varsta lui Marcel este: " + getAge(students, "Marcel"));
        students.remove("Vio");
        System.out.println("students: " + students);
        System.out.println("avem studenti cu varsta de 42? " + students.containsValue(42));


        for (Integer age : students.values()){
            System.out.println("varsta studentilor: " + age);
        }

        for (String key : students.keySet()){
            System.out.println("Nume: " + key);
        }

        for (Map.Entry<String, Integer> entry : students.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

    }

    private static Map<String, Integer> initializerMap(){
        Map<String, Integer> students = new HashMap<>();
        students.put("Marcel", 39);
        students.put("Marcela", 40);
        students.put("Vio", 23);
        return students;
    }

    private static void updateMap(Map<String, Integer> map, String name, int age){
        map.put(name, age);
    }

    private static Integer getAge(Map<String, Integer> map, String key){
        return map.get(key);
    }

}