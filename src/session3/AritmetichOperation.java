package session3;

public class AritmetichOperation {
    public static void main(String[] args) {

        int varA = 21;
        int varB = 6;
        int varC = 3;
        int varD = 1;
        int rez1 = varA - varB / varC;
        System.out.println("Rez1= " + rez1);
        System.out.println(varA - varB / varC);

        int rez2 = (varA - varB) / varC;
        System.out.println("Rez2= " + rez2);

        int rez3 = varA / varC * varD + varB;
        System.out.println("Rez3= " + rez3);

        int rez4 = varA / (varC * (varD + varB));
        System.out.println("Rez4= " + rez4);

        int a = 2;
        int b = 3;
        int c = 4;

        System.out.println(a += b);
        System.out.println(a += 2);
        System.out.println(a += b + 13);
        System.out.println(a *= c * 2 + 2); // a = a * (c*2 +2)
        a = 1;
        System.out.println(a++); //1 a=2
        System.out.println(a); //2
        System.out.println(++a); //3





    }
}
