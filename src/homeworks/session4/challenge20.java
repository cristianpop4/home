package homeworks.session4;

public class challenge20 {
    public static void main(String[] args) {
        int a = 15 , b = 60 , c = 2;
        if(a > b && a > c){
            System.out.println("Cel mai mare dintre ele esta: " + a);
        } else if (b > c && b > a) {
            System.out.println("Cel mai mare dintre ele este: " + b);
        } else if (c > b && c > a) {
            System.out.println("Cel mai mare dintre ele este: " + c);
        }
    }
}
