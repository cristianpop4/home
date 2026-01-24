package session10;

public class Person {

    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void getDetails(){
        System.out.println("Nuemle persoanei: " + name);
        System.out.println("Varsta persoanei: " + age);
    }
}
