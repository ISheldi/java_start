package ua.com.foxminded.motomanager;

public class MotoManager {
    public static void main(String[] args) {

        Moto suzuki = new MiniMoto("Suzuki GSX-R1000", 2021, 16000, 600, Color.BLACK, "diesel", true);

        suzuki.adDistance(10_000);
        suzuki.changeColor(Color.YELLOW);

        System.out.println(suzuki);
        System.out.println(suzuki.isReadyToService());

//        suzuki.destroyEngine();
//        suzuki.repair();



    }
}
