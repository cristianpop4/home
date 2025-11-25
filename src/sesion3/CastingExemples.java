package sesion3;

public class CastingExemples {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7; // 00000111 8 bit in memorie
        short shortVal = 7; // 16 bit
        int intVal = 7; // 32 bit
        long longVal = 10; // 64 bit
        long longVal2 = 6531131713234234234L;

        short rez1 = byteVal; // alowed
        System.out.println(rez1);
        short rez2 = (short) longVal;
        short rez3 = (short) longVal2;
        System.out.println(rez3);

        int rez4 = (int) 1.0f;
        System.out.println(rez4);

        float rez5 = longVal - floatVal;
        System.out.println(rez5);

        intVal = Integer.MAX_VALUE;
        System.out.println(intVal);
        intVal = Integer.MIN_VALUE;
        System.out.println(intVal);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(10 % 3);
        System.out.println(16 % 5);
    }
}
