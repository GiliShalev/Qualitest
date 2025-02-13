package quolitest.solutions.oop;

public class Chair {
    public double getLength() {
        return length;
    }

    public Chair(double length, double width, double height, String color, String material) {
        setLength(length);
        setWidth(width);
        setHeight(height);
        setColor(color);
        this.material = material;
    }

    public double getVolume(){
        return height * length * width;
    }

    public void printInfo(){
        System.out.println("Material is: " + material);
        System.out.println("Color is: " + color);
        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);
        System.out.println("Length is: " + length);
        System.out.println("Volume is: " + getVolume());
    }

    protected boolean isSizeLegal(double length, int min, int max){
        if(length < min || length > max) {
            System.out.println("Size must be 10-150!");
            return false;
        }
        return true;
    }

    public void setLength(double length) {
        if(isSizeLegal(length, 10, 150))
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(isSizeLegal(width, 10, 150))
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(isSizeLegal(height, 10, 150))
            this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // 1 - ask on each with || or &&
        // 2 - use list and contains
        // 3 - use matches (regexp)
        // 4 - use one string and indexOf or contains
        // 5 - use array and loop
        // 6 - use ENUM
        if(!color.matches("Black|White|Red|Green|Blue")) {
            this.color = "White";
            return;
        }
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    double length, width, height;
    String color, material;
}
