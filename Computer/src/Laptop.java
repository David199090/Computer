public class Laptop extends Computer {

    public Laptop(String brand, String processor, int ram) {
        super(brand, processor, ram);
    }

    @Override
    public void powerOn() {
        System.out.println("The laptop is powered on with a built in screen");
    }

    public void connectToWiFi() {
        System.out.println("The laptop is connected to Wi-Fi");
    }
}
