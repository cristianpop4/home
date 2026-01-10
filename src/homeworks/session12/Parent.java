package homeworks.session12;

public abstract class Parent {
    public abstract void message();
}

class FisrstSubclass extends Parent{
    @Override
    public void message(){
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent{
    @Override
    public void message(){
        System.out.println("This is second subclass");
    }
}

class Main{
    static void main() {
        FisrstSubclass fisrstSubclass = new FisrstSubclass();
        SecondSubclass secondSubclass = new SecondSubclass();
        fisrstSubclass.message();
        secondSubclass.message();
    }
}
