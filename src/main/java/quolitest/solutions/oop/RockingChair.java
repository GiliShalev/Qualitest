package quolitest.solutions.oop;

public class RockingChair extends Chair{
    public int getMaxRockingAngle() {
        return maxRockingAngle;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Maximum rocking angle is: " + maxRockingAngle);
    }

    public void setMaxRockingAngle(int maxRockingAngle) {
        if(isSizeLegal(maxRockingAngle, 0, 180))
            this.maxRockingAngle = maxRockingAngle;
    }

    int maxRockingAngle;
    public RockingChair(double length, double width, double height, String color, String material, int maxRockingAngle) {
        super(length, width, height, color, material);
        setMaxRockingAngle(maxRockingAngle);
    }
}
