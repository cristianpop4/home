package session5;

public class FlowControl {
    public static void main(String[] args) {
//        int valoare = 5;
        System.out.println("while: ");
        printNumbersWhileDo(5);
        System.out.println("do while: ");
        printNumbersDoWhile(11);
        System.out.println("for: ");
        printNumbersFor(10);
        System.out.println("for each");
        int[] array = {1, 2, 3, 4, 5};
        printNumbersForEache(array);
        System.out.println("matrice");
        int[][] biArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printListOfList(biArray);

        printUntilValue(5);
    }

    public static void printNumbersWhileDo(int number) {
        while (number <= 10) {
            System.out.println("numarul: " + number);
            number++;
        }
    }

    public static void printNumbersDoWhile(int number) {
        do {
            System.out.println("numarul: " + number);
            number++;
        } while (number <= 10);
    }

    public static void printNumbersFor(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println("numarul: " + i);
        }
    }

    public static void printNumbersForEache(int[] array) {
        for (int number : array) {
            System.out.println("numarul: " + number);
        }
    }
//    int[][] biArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    public static void printListOfList(int[][] biArray) {
        for (int[] array : biArray){
            for (int number : array){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void printUntilValue(int value){
        for (int i = 0 ; i <= 10 ; i++){
            if (i == value){
                break;
            }
            System.out.println("numar until Value: " + i);
        }
    }
}
