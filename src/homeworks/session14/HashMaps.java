package homeworks.session14;

import java.util.HashMap;

public class HashMaps {
    static void main(String[] args) {
        System.out.println("HashMap elements: " + hashMap());
        size();
    }

    private static HashMap<Integer, String> hashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "blue");
        hashMap.put(2, "red");
        hashMap.put(3, "yellow");
        hashMap.put(4, "purple");
        return hashMap;
    }

    private static void size(){
        HashMap<Integer, String> hashMap = new HashMap<>();
        System.out.println("Size: " + hashMap.size());
    }
}
