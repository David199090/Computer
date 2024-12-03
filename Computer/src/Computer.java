public class Computer {
    private String brand;
    private String processor;
    private int ram;

    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    public void powerOn() {
        System.out.println("The computer is powered on");
    }

    public void performOperation() {
        System.out.println("The computer is performing an operation");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
