package homeworks.session5;

public class EvenOrOddChecker {

    public static void main(String[] args) {
        printChallenge1(7);
    }

    public static void printChallenge1(int imput){
        if (imput % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
