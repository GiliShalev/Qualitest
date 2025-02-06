public class Loops {

    public static void main( String[] args )
    {

//        for(int i = 0; i < 10; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 10; i >= 0; i--){
//            System.out.println(i);
//        }
//
//        for(int i = 1; i <= 10; i = i + 2){
//            System.out.println(i);
//        }
//
//        int a= 70
//        while(a < 50){
//            System.out.println(a);
//        }
//
//
//        int times = 33;
//
//        boolean condition = true;
//
//        while(condition){
//            // Do something
//        }
//
//
//        a = 33;
//        while(a < 50){
//            System.out.println(a);
//            a++;
//        }
//        while(a < 50 || a == 50){
//            System.out.println(a);
//            a++;
//        }

//
//        String[] myArray = {"Dog", "Cat", "Bird"};
//        for(int i = 0; i < myArray.length; i++)
//            System.out.println(myArray[i]);
//
//
//
//
//
//        for (String item : myArray){
//            System.out.println(item);
//        }
//
//        int[] myIntArray = {4, 6, 99};
//        for (int item : myIntArray){
//            System.out.println(item);
//        }
//
//        for(int i = 1; i <= 10; i++){
//            if(i == 5)
//                break;
//            System.out.println(i);
//        }
//
//
//
//
//        int[] p = {3, 5, 88, 1};
//        int lastItem = p[0];
//        for(int i = 0; i < p.length; i++){
//            if(p[i] > lastItem)
//                lastItem = p[i];
//        }
//        System.out.println(lastItem);
//
//
//        lastItem = 0;
//        for (int item : p){
//            if(item > lastItem)
//                lastItem = item;
//        }
//        System.out.println(lastItem);
//
//
//        boolean condition = true;
//
//
//
//        int a = 90;
//        do{
//            a--;
//        }while(a > 80);


        for(int i = 1; i <= 10; i++){
             for(int j = 1; j <= 10; j++){
                 System.out.print(i * j);
            }
            System.out.println();
        }


        Methods methods = new Methods();
        int r = methods.sum(1, 2);
        methods.printSum(3, 7);


    }

}
