package quolitest.solutions.oop;

public abstract class MobilePhone {

    public MobilePhone(String manufacturer, String model, double screenSize) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
    }


    private String manufacturer, model;
    private double screenSize;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if(screenSize < 5 || screenSize > 50)
            System.out.println("Size must be 5-50!");
        else
            this.screenSize = screenSize;
    }

    public void printInfo(){
        System.out.println("Manufacturer is: " + manufacturer);
        System.out.println("Model is: " + model);
        System.out.println("Screen Size is: " + screenSize);
    }

    public abstract void printLogo();


}
