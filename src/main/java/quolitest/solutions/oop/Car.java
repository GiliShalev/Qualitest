package quolitest.solutions.oop;

public class Car {
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public double getPrice() {
        return price * vat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    public Car(String vendor, String model, int numOfWheels, int price) {
        this(vendor, model);
        this.numOfWheels = numOfWheels;
        this.price = price;
    }

    private String vendor, model;
    private int numOfWheels = 4;
    private double price;
    private double vat = 1.18;

    public void go(){
        go(120);
    }

    public void go(int maxSpeed){
        System.out.println("Speeding to: " + maxSpeed);
    }

    public void stop(){
        slow(0);
    }

    public void slow(int minSpeed){
        System.out.println("Slowing to: " + minSpeed);
    }

    public String getVendorAndModel(){
        return vendor + " " + model;
    }




}
