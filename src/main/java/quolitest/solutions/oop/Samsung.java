package quolitest.solutions.oop;

public class Samsung extends MobilePhone{

    private Boolean jailBreak;

    public Samsung(String model, double screenSize, Boolean jailBreak) {
        super("Samsung", model, screenSize);
        this.jailBreak = jailBreak;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jail Break is: " + jailBreak);
    }
    @Override
    public void printLogo() {
        System.out.println("&*()");
    }
}
