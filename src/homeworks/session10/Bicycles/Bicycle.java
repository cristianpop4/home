package homeworks.session10.Bicycles;

public class Bicycle {
    private int speed;
    private int gear;

    public Bicycle(int speed, int gear){
        this.speed = speed;
        this.gear = gear;
    }

    public void changeGear(int newGear){
        gear = newGear;
        System.out.println("The new gear is: " + newGear);
    }

    public void speedUp(int accelerate){
        speed += accelerate;
        System.out.println("The new speed is: " + speed);
    }

    public void applyBrake(int brake){
        speed -= brake;
        System.out.println("The new speed is: " + speed);
    }

    public String getDitails() {
        return "Bicycle{" +
                "speed=" + speed +
                ", gear=" + gear +
                '}';
    }
}
class MontainBike extends Bicycle{
    private String tireType;
    private String suspension;

    public MontainBike(int speed, int gear, String tireType, String suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;
    }

    public void adjustSuspension(String newSuspension){
        suspension = newSuspension;
        System.out.println("The new suspension is: " + newSuspension);
    }

    @Override
    public String toString() {
        return "MontainBike{" +
                "tireType='" + tireType + '\'' +
                ", suspension='" + suspension + '\'' +
                '}';
    }
}

class Bicycles{
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(30, 6);
        bicycle.changeGear(7);
        bicycle.speedUp(5);
        bicycle.applyBrake(20);
        System.out.println(bicycle.getDitails());

        MontainBike montainBike = new MontainBike(25, 4, "Continental", "Fox");
        montainBike.speedUp(15);
        montainBike.changeGear(6);
        System.out.println(montainBike.getDitails());
        System.out.println(montainBike.toString());
    }
}