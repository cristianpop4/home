package homeworks.session16;

import java.util.Objects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

class RectangleMain{
    static void main(String[] args) {
        Rectangle r1 = new Rectangle(12, 10);
        Rectangle r2 = new Rectangle(12, 10);

        System.out.println(r1.equals(r2));
        if (r1.hashCode() == r2.hashCode())
            System.out.println(r1.hashCode());
        else System.out.println("The hashCode is not the same");
    }
}