public class Car {
    public Car() {
    }

    public Car(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }
    public Car(String vendor, String model, double price) {
        this(vendor, model);
        this.price = price;
    }

    public Car(String vendor) {
        vendor = vendor;
    }

    private static int numOfCars;
    private int numOfWheels = 4;
    private String vendor, model;


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


