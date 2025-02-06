package quolitest.solutions.oop;

public class Program {

    public static void main(String[] args){

        Car volvo1 = new Car("Volvo", "X25", 4, 230000);
        Car ford1 = new Car("Volvo", "X25");
        ford1.setPrice(200000);
        double priceWithVat = ford1.getPrice();
        System.out.println("Price with VAT: " + priceWithVat);
        volvo1.go(120);
        String vendorAndModel = ford1.getVendorAndModel();
        System.out.println("Vendor and model are: " + vendorAndModel);

        Passenger moses = new Passenger("Gil", "Shalev", "MEAT", "24A");
        Passenger yael = new Passenger("Yael", "Cohen", "VEG", "24B");
        Passenger david = new Passenger("David", "Levi", "FISH", "25A");
        Passenger rachel = new Passenger("Rachel", "Stern", "MILK", "14C");
        moses.setMeal("PASTA");
        yael.printInfo();

        Flight flight1 = new Flight(200, "London", "Paris", "12/12/2025", "12:12");
        Flight flight2 = new Flight(200, "Rome", "Paris", "12/07/2025", "13:00");
        flight1.addPassenger(moses);
        flight1.addPassenger(yael);
        flight2.addPassenger(david);
        flight2.addPassenger(rachel);

        Passenger[] passengers = flight1.getPassengers();
        for(Passenger passenger : passengers) {
            if(passenger == null)
                break;
            System.out.println("Passenger name is: " + passenger.getFirstName() + " " + passenger.getLastName());
        }

        Passenger firstPassenger = flight2.getPassenger(1);
        System.out.println("Passenger name is: " + firstPassenger.getFirstName() + " " + firstPassenger.getLastName());
        int totalPass = Flight.getTotalPassengersInAllFlights();
        System.out.println("Total passengers in all flights: " + totalPass);

    }

}
