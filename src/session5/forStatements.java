package session5;

public class forStatements {
    public static void main(String[] args) {

        for(int i = 0; i <= 10 ; i++){
            System.out.println("numarul curent este: " + i);
        }

        for(int i=0 ; i <= 10 ; i+=2){
            System.out.println("numarul meu este: " + i);
        }

        int[] sir = {1,2,3,4,5, 10, 2};
        for(int i=0 ; i < sir.length ; i++){
            System.out.println(sir[i]);
        }
        System.out.println(sir[5]);
        for(int number : sir){
            System.out.println("numarul din sir este: " + number);
        }
    }
}
