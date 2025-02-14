import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Methods {

    public static void main( String[] args )
    {
//        Car.doSomething();
//
        Car volvo = new Car();
        Car man = new Car("Man", "X2", 180000, 555);

        String[] arr = {"aaa", "bbb"};
        volvo.myFunction(2, arr);
        volvo.myFunction1(3);
        volvo.myFunction1(4, arr);


//        Car.getNumOfCars();
        volvo.setPrice(123000.50);
//        volvo.getPrice();
//
//        volvo.go(120);
//        volvo.printToConsole(2);
//        volvo.printToConsole("Hello");
//
//        String model = volvo.getModel();
//
//
//        System.out.println(model);
//        volvo.go(100);
//        man.stop();
//
//        Eagle eagle = new Eagle("Golden", true);
//        eagle.fly();

        LinkedList<Integer> intArrayList = new LinkedList<>();
        intArrayList.add(20);
        intArrayList.add(20);

        LinkedList<String> names = new LinkedList<>();
        names.add("Gil");
        names.add("Moshe");

        String firstItem = names.get(0);

        names.add("Gil");
        names.add(0, "Ron");

        String firstName = names.get(0);

        int size = names.size();

        // names.clear();



        boolean isExist = names.contains("Gil");

        int index = names.indexOf("Gil");

        names.remove("Gil");
        names.remove(0);
        

        if(names == null)
            System.out.println("N");
        int y = 99;

        ArrayList<Car> cars = new ArrayList();
        cars.add(new Car());
        boolean g = cars.contains("Car@b4c966a");

        HashSet<String> names1 = new HashSet<>();



        names1.add("Gil");

        names1.remove("Gil");

        names1.size();
        names1.add("Tali");
        names1.add("Ron");

        y = 98;


    }



    public int sum(int x, int y){
        int add = x + y;
        return add;
    }

    public void printSum(int x, int y){
        System.out.println(x + y);
    }






}
