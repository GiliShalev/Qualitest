package quolitest.solutions;


import java.util.Scanner;

public class Loops {

    public static void main( String[] args )
    {

        // 1
//        int sum = 0;
//        int[] intArr = {2, 5, 8, 9, 45, 22};
//        for(int i : intArr) {
//            System.out.println(i);
//            sum = sum + i;
//        }
//        System.out.println("Sum is: " + sum);
//        System.out.println("Average is: " + (double)sum / intArr.length);
//
//        sum = 0;
//        for(int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//            sum = sum + intArr[i];
//        }
//        System.out.println("Sum is: " + sum);
//        System.out.println("Average is: " + (double)sum / intArr.length);

        // 2
//        int sum1 = 0;
//        Scanner con = new Scanner(System.in);
//        do {
//            System.out.println("Please enter a number");
//            int num = con.nextInt();
//            sum1 += num;
//        }while(sum1 <= 50);
//        System.out.println("DONE");
//        // con.close();
//
//        int sum2 = 0;
//        int num1;
//        while (sum2 <= 50) {
//            System.out.println("Please enter a number");
//            num1 = con.nextInt();
//            sum2 += num1;
//        }
//        System.out.println("DONE 2");
//        con.close();

        // 3
        int[] arr = {2, 17, 99};
        int large = 0;
        for(int x : arr) {
            if (x > large)
                large = x;
        }
        System.out.println(large);

        large = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > large)
                large = arr[i];
        }
        System.out.println(large);

        int[] arr1 = {-2, -17, -99};
        large = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(i == 0) {
                large = arr1[i];
                continue;
            }
            if (arr1[i] > large)
                large = arr1[i];
        }
        System.out.println(large);

        // 4
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i * j);
            }
            System.out.println();
        }

        // 5
        String[] sentence = {"My", "name", "is", "Gil"};
        char space = ' ';
        for(String t : sentence)
            System.out.print(t + space);

        // 6
        short[] myShort = {2, 3, 4, 55, 87, 90, 4, 12, 7, 43};
        for(short t : myShort){
            if(t % 2 == 0)
                System.out.println("I'm Even: " + t);
        }

        // 7
        for (int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }




    }
}
