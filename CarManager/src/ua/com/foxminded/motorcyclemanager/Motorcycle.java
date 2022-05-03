package ua.com.foxminded.motorcyclemanager;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        Motorcycle that = (Motorcycle) o;
        return color == that.color && engineType.equals(that.engineType) && isReadyToDrive.equals(that.isReadyToDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engineType, isReadyToDrive);
    }
}
