package homeworks.session10.Cars;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Car starded");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }
}

class ElectricCar extends Car {
    private int baterryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year, int baterryCapacity, int range){
        super(make, model, year);
        this.baterryCapacity = baterryCapacity;
        this.range = range;
    }

    public void charge(){
        System.out.println("Car is charging");
    }
}

class Tesla extends ElectricCar{
    private String autopilotVersion;

    public Tesla (String make, String model, int year, int baterryCapacity, int range, String autopilotVersion){
        super(make, model, year, baterryCapacity, range);
        this.autopilotVersion = autopilotVersion;
    }

    public void enableAutopilot(){
        System.out.println("Autopilot " + autopilotVersion + " enable");
    }
}

class Cars{
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla", "Model S", 2019, 4000, 500, "v3.0");

        tesla.start();
        tesla.accelerate();
        tesla.enableAutopilot();
        tesla.stop();
        tesla.charge();
    }
}
//