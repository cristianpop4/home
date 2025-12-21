package homeworks.session10.Watercraft;

public class Boat {

    private String boatName;
    private double lenght;
    private int weight;

    public Boat(String boatName, double lenght, int weight){
        this.boatName = boatName;
        this.lenght = lenght;
        this.weight = weight;
    }

    public String getBoatName() {
        return boatName;
    }

    public double getLenght() {
        return lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void sail(){
        System.out.println("The boat is sailing");
    }
}

class SpeedBoat extends Boat{

    private int maxSpeed;
    private String engineType;

    public SpeedBoat(String boatName, double lenght, int weight, int maxSpeed, String engineType){
        super(boatName, lenght, weight);
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void turboBoost(){
        System.out.println("TuboBoost is on");
    }
}

class FishingBoat extends Boat{

    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(String boatName, double lenght, int weight, int fishCapacity, String typeOfNet){
        super(boatName, lenght, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public int getFishCapacity() {
        return fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void castNet(){
        System.out.println("The net is dropped");
    }
}

class Watercraft{
    public static void main(String[] args) {
        SpeedBoat speedBoat = new SpeedBoat("Sea Ray SPX 210",6.5, 1600, 80, "V8");
        speedBoat.sail();
        System.out.println(speedBoat.getBoatName());
        System.out.println(speedBoat.getMaxSpeed() + " km/h" + " " + speedBoat.getEngineType());
        speedBoat.turboBoost();

        FishingBoat fishingBoat = new FishingBoat("Beneteau Barracuda 7", 7.5, 2300, 600, "Plasă de pescuit tip monofilament");
        fishingBoat.sail();
        System.out.println(fishingBoat.getBoatName() + ", " + fishingBoat.getFishCapacity()+ " kg" + ", " + fishingBoat.getTypeOfNet());
        fishingBoat.castNet();
    }
}

