package homeworks.session12;

public abstract class Bank {
    public abstract void getBalance();
}

class BankA extends Bank{
    @Override
    public void getBalance(){
        System.out.println("BankA balance is $100");
    }
}

class BankB extends Bank{
    @Override
    public void getBalance(){
        System.out.println("BankB balance is $150");
    }
}

class BankC extends Bank{
    @Override
    public void getBalance(){
        System.out.println("BankC balance is $200");
    }
}

class Main1{
    static void main() {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}