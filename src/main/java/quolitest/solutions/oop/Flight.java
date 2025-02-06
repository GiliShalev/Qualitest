package quolitest.solutions.oop;

public class Flight {

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public static int getTotalPassengersInAllFlights() {
        return totalPassengersInAllFlights;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Flight(int numOfSeats, String from, String to, String date, String time) {
        this.numOfSeats = numOfSeats;
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
        passengers = new Passenger[numOfSeats];
    }

    private int numOfSeats, numOfPassengers;
    private String from, to, date, time;
    private Passenger[] passengers;
    private static int totalPassengersInAllFlights;

    public void addPassenger(Passenger passenger){
        passengers[numOfPassengers] = passenger;
        numOfPassengers++;
        totalPassengersInAllFlights++;
    }

    public Passenger getPassenger(int index){
        return passengers[index];
    }


}
