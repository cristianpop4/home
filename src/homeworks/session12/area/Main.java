package homeworks.session12.area;

public class Main {
    static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(2, 10);
        area.SquareArea(4);
        area.CircleArea(2);
    }
}

abstract class Shape{
    public abstract void RectangleArea(int lenght, int breadth);
    public abstract void SquareArea(int size);
    public abstract void CircleArea(int radius);
}

class Area extends Shape{
    @Override
    public void RectangleArea(int lenght, int breadth){
        System.out.println("Rectangle area is: " + lenght * breadth);
    }
    @Override
    public void SquareArea(int size){
        System.out.println("Square area is: " + size * size);
    }
    @Override
    public void CircleArea(int radius){
        System.out.println("Circle area is: " + radius * radius + "PI");
    }
}