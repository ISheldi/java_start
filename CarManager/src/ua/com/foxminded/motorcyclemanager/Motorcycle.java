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
    private int distance = 0;

    public Motorcycle(String name, int yearOfProduction, int price, int weight, Color color, String engineType, Boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }

    public void addDistance(int additinalDistance){
        distance += additinalDistance;
    }
    public void addDistance(float additinalDistance){
        distance += Math.round(additinalDistance);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void repair (){
        this.isReadyToDrive = true;
    }
    public void destroyEngine (){
        this.isReadyToDrive = false;
    }

    public void changeColor(Color color){
        this.color = color;
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
                ", distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motorcycle)) return false;
        Motorcycle that = (Motorcycle) o;
        return color == that.color && distance == that.distance && isReadyToDrive.equals(that.isReadyToDrive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engineType, isReadyToDrive);
    }
}
