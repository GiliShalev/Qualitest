package quolitest.solutions.oop;

public class Passenger {
    public Passenger(String firstName, String lastName, String meal, String seat) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMeal(meal);
        this.seat = seat;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        String[] meals = {"MEAT", "FISH", "VEG"};
        for(String currentMeal : meals){
            if(currentMeal.equalsIgnoreCase(meal)){
                this.meal = meal;
                return;
            }
        }
        System.out.println("Only valid meal options are: MEAT, VEG, FISH");
    }

    public void setMeal1(String meal) {
        if(!meal.equalsIgnoreCase("MEAT")
            && !meal.equalsIgnoreCase("VEG")
                && !meal.equalsIgnoreCase("FISH"))
            System.out.println("Only valid meal options are: MEAT, VEG, FISH");
        else
            this.meal = meal;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    private String firstName;
    private String lastName;
    private String meal;
    private String seat;
    private int passportNumber;

    public Passenger(String firstName, String lastName, String meal, String seat, int passportNumber) {
        this(firstName, lastName, meal, seat);
        this.passportNumber = passportNumber;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void printInfo(){
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Meal is " + meal);
        System.out.println("Seat is " + seat);
    }


}
