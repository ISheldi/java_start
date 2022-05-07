package ua.com.foxminded.motorcyclemanager;

public class MotorcycleManager {
    public static void main(String[] args) {
        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, Color.BLACK, "diesel", true);
        Motorcycle yamaha = new Motorcycle( "Yamaha FZ1", 2007, 9000, 700, Color.ORANGE, "gas", false);

        suzuki.addDistance(250000);
        suzuki.addDistance(11.5f);
        suzuki.destroyEngine();
        // System.out.println(suzuki);

        yamaha.addDistance(250000);
        yamaha.addDistance(-11.5f);
        yamaha.destroyEngine();
        // System.out.println(yamaha);

        suzuki.repair();
        yamaha.repair();

        yamaha.changeColor(Color.BLACK);

        System.out.println();
        System.out.println(suzuki);
        System.out.println(yamaha);
        System.out.println(suzuki.equals(yamaha));
    }
}
