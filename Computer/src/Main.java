public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Generic Brand", "Intel", 8);
        computer.powerOn();
        computer.performOperation();

        Desktop desktop = new Desktop("Dell", "Intel i7", 16);
        desktop.powerOn();
        desktop.connectToMonitor();

        Laptop laptop = new Laptop("HP", "Intel i5", 8);
        laptop.powerOn();
        laptop.connectToWiFi();
    }
}
