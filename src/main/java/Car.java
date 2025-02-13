public class Car {
    public Car() {
    }

    public Car(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }
    public Car(String vendor, String model, double price, int licenseNumber) {
        this(vendor, model);
        this.price = price;
        this.licenseNumber = licenseNumber;
    }

    public Car(String vendor) {
        vendor = vendor;
    }

    private static int numOfCars;
    private int numOfWheels = 4;
    private String vendor, model;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    private int licenseNumber;

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    private double price;
    public double getPrice() {
        return price;
    }

    final private double vat = 1.18;
    public void setPrice(double price) {
        this.price = price * vat;
    }

    public void myFunction(int i, String[] str){

    }

    public void myFunction1(int i, String... str){

    }



    protected void go(int maxSpeed){
        // Do something
    }

    void stop(){
        slow(0);
    }

    public void slow(int minSpeed){
        // Slow
    }

    public static void doSomething(){
        // To Do
    }

    public String getModel(){
        return this.model;
    }

    public static int getNumOfCars() {
        return Car.numOfCars;
    }


    public void printToConsole(String text){
        System.out.println(text);
    }

    public void printToConsole(int num){
        System.out.println(num);
    }



}


