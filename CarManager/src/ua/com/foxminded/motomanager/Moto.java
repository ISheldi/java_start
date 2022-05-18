package ua.com.foxminded.motomanager;

import java.util.Objects;

public abstract class Moto implements Serviceable {

    String name;
    int yearOfProduction;
    int price;
    int weight;
    Color color;
    String engineType;
    boolean isReadyToDrive;
    private int distance = 0;
    protected int distanceOnService = 0;

    public Moto(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.engineType = engineType;
        this.isReadyToDrive = isReadyToDrive;
    }
    public void repair(){
        isReadyToDrive = true;
    }
    public void destroyEngine(){
       if (distance > 200_000){
           isReadyToDrive = false;
        }
    }

    public void needService(){
        if (distance > 8_000){

        }
    }

    public void changeColor(Color newColor){
        color = newColor;
    }

    public void adDistance(int additionalDistance){
        distance += additionalDistance;
        distanceOnService += additionalDistance;

    }

    public int getDistanceOnService() {
        return distanceOnService;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                ", weight=" + weight +
                ", color=" + color +
                ", engineType='" + engineType + '\'' +
                ", isReadyToDrive=" + isReadyToDrive +
                ", distance=" + distance +
                ", distanceOnService=" + distanceOnService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moto)) return false;
        Moto moto = (Moto) o;
        return isReadyToDrive == moto.isReadyToDrive && color == moto.color && Objects.equals(engineType, moto.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, engineType, isReadyToDrive);
    }
}
