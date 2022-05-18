package ua.com.foxminded.motomanager;

public class MiniMoto extends Moto {
    public MiniMoto(String name, int yearOfProduction, int price, int weight, Color color, String engineType, boolean isReadyToDrive) {
        super(name, yearOfProduction, price, weight, color, engineType, isReadyToDrive);
    }

    @Override
    public boolean isReadyToService() {
        return distanceOnService > 8_000;
    }
}
