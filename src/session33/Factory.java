package session33;

import homeworks.session12.Parent;

interface Animal{
    void makeSound();
}

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Bark Bark");
    }
}

class Cat implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Roar Roar");
    }
}

class AnimalFactory{
    public Animal createAnimal(String type){

       if (type.equalsIgnoreCase("dog")){
           return new Dog();
       } else if (type.equalsIgnoreCase("cat")){
           return new Cat();
       } else if (type.equalsIgnoreCase("lion")){
           return new Lion();
       }
       return null;
    }
}




public class Factory {
    static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal patrocle = factory.createAnimal("dog");
        Animal cartofel = factory.createAnimal("cat");
        Animal leut = factory.createAnimal("lion");

        patrocle.makeSound();
        cartofel.makeSound();
        leut.makeSound();
    }
}
