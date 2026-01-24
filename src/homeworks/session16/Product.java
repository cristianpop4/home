package homeworks.session16;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

class ProductMain{
    static void main(String[] args) {
        Product p1 = new Product(12, "Paste", 15.99);
        Product p2 = new Product(12, "Paine", 1.99);

        System.out.println("Id is the same");
        System.out.println(p1.equals(p2));
        if (p1.hashCode() == p2.hashCode())
            System.out.println(p1.hashCode());
        else System.out.println("The hashCode is not the same");

        System.out.println("p1 id is changed");
        p1.setId(13);
        System.out.println(p1.equals(p2));
        if (p1.hashCode() == p2.hashCode())
            System.out.println(p1.hashCode());
        else System.out.println("The hashCode is not the same");
    }
}