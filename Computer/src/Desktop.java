public class Desktop extends Computer {

    public Desktop(String brand, String processor, int ram) {
        super(brand, processor, ram);
    }

    @Override
    public void powerOn() {
        System.out.println("The desktop computer is powered on with a tower");
    }

    public void connectToMonitor() {
        System.out.println("The desktop is connected to a monitor");
    }
}
