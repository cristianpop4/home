package homeworks.session8;

import java.util.*;

public class h8 {
    public static void main(String[] args) {
//        shoppingList();
//        wishlist();
//        graduatedStudents();
//        countIntegers();
//        cityNames();
//        storingStudents();
//        fruitsSort();
//        movieSearch();
        binaryConvertor();
    }

    public static void shoppingList() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("paine", "apa", "mancare"));
        System.out.println(list);
    }

    public static void wishlist() {
        ArrayList<String> wishlist = new ArrayList<>(Arrays.asList("cadouri", "orice"));
        System.out.println(wishlist);
    }

    public static void graduatedStudents() {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.addAll(List.of("George", "Ana", "Ion", "Maria", "Marcel", "Ronaldo", "Cristian", "Marcela", "Andrei", "Alexandru"));
        graduateStudentList.addAll(studentList);
        for (int i = 0; i < graduateStudentList.size(); i++) {
            System.out.println(graduateStudentList.get(i));
        }
    }

    public static void countIntegers() {
        int[] numbers = {1, 12, 54, 68, 89, 1024};
        int countOdd = 0, countEven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("sunt " + countEven + " numere pare si " + countOdd + " numere impare");
    }

    public static void cityNames() {
        ArrayList<String> city = new ArrayList<>(Arrays.asList("Tg Jiu", "Bucuresti", "Craiova", "Timisoara", "Arad"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un oras:");
        String intput = scanner.nextLine();
        if (city.contains(intput)) {
            System.out.println("it's duplicate");
        } else {
            city.add(intput);
            System.out.println(city);
        }
    }

    public static void storingStudents() {
        List<String> linked = new LinkedList<>(List.of("George", "Ana", "Ion", "Maria", "Marcel", "Ronaldo", "Cristian", "Marcela", "Andrei", "Alexandru"));
        if (linked.contains("George")) {
            linked.remove("George");
        }
        System.out.println(linked);
    }

    public static void fruitsSort() {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("banane", "porotcale", "mandarine", "merre", "pere", "prune", "piersici", "caise"));
        for (int i = 0; i < fruits.size(); i++) {
            for (int j = i + 1; j < fruits.size(); j++) {
                if (fruits.get(i).length() < fruits.get(j).length() || (fruits.get(i).length() == fruits.get(j).length() && fruits.get(i).compareTo(fruits.get(j)) > 0)) {
                    String temp = fruits.get(i);
                    fruits.set(i, fruits.get(j));
                    fruits.set(j, temp);
                }
            }
        }
        System.out.println(fruits);
    }

    public static void movieSearch() {
        String[] movies = {"Inception", "The Matrix", "Interstellar", "Titanic", "Avatar"};
        String searchMovie = "Titanic";
        boolean found = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(searchMovie)) {
                System.out.println(searchMovie + " found at position " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(searchMovie + "not found");
        }
    }

    public static void binaryConvertor(){
        String number = "1011";
        int number1 = Integer.parseInt(number, 2);
        System.out.println(number);
        System.out.println(number1);
    }


}
