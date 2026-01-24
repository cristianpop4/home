package session12;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

class Geometry {

    public float area(float l, float i) {
        return l * i;
    }

    public float area(float raza){
        return (float) (Math.PI * raza * raza);
    }

}


class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int rez1 = calculator.sum(2, 4);
        int rez2 = calculator.sum(3, 5, 6);
        float rez3 = (float) calculator.sum(1.2, 2.4);

        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);

        Geometry geometry = new Geometry();
        float dreptunghi = geometry.area(2.4f, 2.5f);
        float cerc = geometry.area(3f);

        System.out.println(dreptunghi);
        System.out.println(cerc);
    }
}