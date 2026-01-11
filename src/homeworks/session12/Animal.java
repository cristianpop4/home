package homeworks.session12;

public abstract class Animal {
    public abstract void cats();
    public abstract void dogs();
}

class Cat extends Animal{
    @Override
    public void cats(){
        System.out.println("Cats meow");
    }
    @Override
    public void dogs(){}
}

class Dog extends Animal{
    @Override
    public void cats(){}
    @Override
    public void dogs(){
        System.out.println("Dogs bark");
    }
}

class Main4{
    static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.cats();
        dog.dogs();
    }
}