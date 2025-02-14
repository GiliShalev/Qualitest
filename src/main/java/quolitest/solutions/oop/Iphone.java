package quolitest.solutions.oop;

public class Iphone extends MobilePhone {

    private int numOfInstalledApps;

    public Iphone(String model, double screenSize, int numOfInstalledApps) {
        super("Iphone", model, screenSize);
        this.numOfInstalledApps = numOfInstalledApps;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Number Of InstalledApps is: " + numOfInstalledApps);
    }
    @Override
    public void printLogo() {
        System.out.println("*****");
    }
}
