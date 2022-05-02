package ua.com.foxminded.motorcyclemanager;

public class MotorcycleManager {
    public static void main(String[] args) {
        Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000",2021, 16000, 600, "black", "diesel","да");

        Motorcycle yamaha = new Motorcycle( "Yamaha  FZ1", 2007, 9000, 700, "orange", "gas","нет");
        System.out.println(suzuki);
        System.out.println(yamaha);
    }
}
