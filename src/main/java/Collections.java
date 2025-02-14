import java.util.*;

public class Collections {

    public static void main( String[] args )
    {




//        ArrayList<Car> cars = new ArrayList();
//        cars.add(0, new Car("Ford", "Mustang", 100000));
//        cars.add(new Car("Volvo", "Mustang", 100000));
//        cars.add(new Car("Mazda", "Mustang", 100000));
//        cars.add(new Car("Subaru", "Mustang", 100000));
//        boolean g = cars.contains("Car@b4c966a");
//
//        System.out.println("By index: " + cars.get(1).getVendor());
//
//        for(Car car : cars)
//            System.out.println(car.getVendor());
//
//        cars.forEach(x -> System.out.println(x.getVendor()));
//









        HashSet<Car> cars = new HashSet<>();
        cars.add(new Car("Ford", "Mustang", 100000, 1));
        cars.add(new Car("Volvo", "Mustang", 100000, 2));
        cars.add(new Car("Mazda", "Mustang", 100000, 3));


        cars.forEach(x -> System.out.println(x.getVendor()));

        for(Car car : cars)
            System.out.println(car.getVendor());

        Car[] arrCars = cars.toArray(new Car[0]);
        int r = 99;

        Car ford = new Car("Ford", "Mustang", 100000, 1234);
        HashMap<Integer, Car> allCars = new HashMap<>();
        allCars.put(ford.getLicenseNumber(), ford);




        int size = allCars.size();

        // allCars.clear();

        boolean exist = allCars.containsKey(1234);


        boolean exist1 = allCars.containsValue(ford);


        System.out.println(exist);
        System.out.println(exist1);



        Car ford1 = allCars.get(1234);

        for (int i : allCars.keySet()) {
            System.out.println(i);
        }

        for (Car car : allCars.values()) {
            System.out.println(car.getVendor());
        }

        for (int i : allCars.keySet()) {
            System.out.println(allCars.get(i).getVendor());
        }


    }



    public int sum(int x, int y){
        int add = x + y;
        return add;
    }

    public void printSum(int x, int y){
        System.out.println(x + y);
    }






}
