package homeworks.session12;

public abstract class Marks {
    public abstract void getPercentage();
}

class StudentA extends Marks {
    private int m1, m2, m3;

    public StudentA(int m1, int m3, int m2) {
        this.m1 = m1;
        this.m3 = m3;
        this.m2 = m2;
    }

    @Override
    public void getPercentage() {
        System.out.println("Procentaj studentA: " + (m1 + m2 + m3) / 3.0 + "%");
    }
}

class StudentB extends Marks {
    private int m1, m2, m3, m4;

    public StudentB(int m1, int m3, int m2, int m4) {
        this.m1 = m1;
        this.m3 = m3;
        this.m2 = m2;
        this.m4 = m4;
    }

    @Override
    public void getPercentage(){
        System.out.println("Procentaj studentA: " + (m1 + m2 + m3 + m4) / 4.0 + "%");
    }
}

class Main2{
    static void main(String[] args) {
        StudentA studentA = new StudentA(80, 90, 85);
        StudentB studentB = new StudentB(75, 85, 80, 90);
        studentA.getPercentage();
        studentB.getPercentage();
    }
}