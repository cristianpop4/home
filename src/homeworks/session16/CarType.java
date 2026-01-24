package homeworks.session16;

public enum CarType {
    SEDAN("Mercedes", 50000),
    SUV("Audi", 30000),
    HATCHBACK("Volkswagen", 20000),
    COUPE("BMW", 60000),
    CONVERTIBLE("Porsche", 70000);

    private String manufacture;
    private int averagePrice;

    CarType(String manufacture, int averagePrice) {
        this.averagePrice = averagePrice;
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "averagePrice=" + averagePrice +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
