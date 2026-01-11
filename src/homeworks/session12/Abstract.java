package homeworks.session12;

public abstract class Abstract {
    Abstract(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends Abstract{
    @Override
    public void a_method(){
        System.out.println("This is abstract method");
    }
}

class Main3{
    static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.a_method();
        subClass.non_abstract();
    }
}