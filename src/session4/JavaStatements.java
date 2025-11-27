package session4;

public class JavaStatements {
    public static void main(String[] args) {

        int curentYear = 2025;
        int birtheYear = 2009;
        int diffYears = curentYear - birtheYear;

        if(diffYears < 18){
            System.out.println("sunt minor");
        } else {
            System.out.println("nu sunt minor");
        }

        if(diffYears < 18){
            System.out.println("sunt minor");
        } else if(diffYears > 70) {
            System.out.println("oh no ..... winter is coming");
        } else{
            System.out.println("sunt doar un adult");
        }
    }
}
