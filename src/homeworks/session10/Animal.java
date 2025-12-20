package homeworks.session10;

public class Animal {
    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("MEOW");
    }
}

class Wolf extends Animal{
    @Override
    public void sound(){
        System.out.println("how");
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        dog.sound();
        cat.sound();
        wolf.sound();
    }
}







