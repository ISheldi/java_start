package ua.com.foxminded.motorcyclemanager;

public class Motorcycle {
    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    Boolean isReadyToDrive;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, Color color, String engineType, Boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                '}';
    }
}
