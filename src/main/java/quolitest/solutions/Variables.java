package quolitest.solutions;


import java.util.Scanner;

public class Variables {

    public static void main( String[] args )
    {

        // 1
        String firstName = "Gil";
        String lastName = "Shalev";
        System.out.println(firstName + " " + lastName);

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.print(firstName + "\n" + lastName);

        // 2
        String firstName1 = "Gil", lastName1 = "Shalev";
        System.out.println(firstName1 + " " + lastName1);

        // 3
        int i = 9, j = 12;
        System.out.println(i + " " + j);
        System.out.println(i + j);

        // 4
        int r = 20, f = 30;
        System.out.println("Sum is: " + r + f);
        System.out.println("Sum is: " + (r + f));

        // 5
        Scanner console = new Scanner(System.in);
//        System.out.println("Please enter 3 numbers: ");
//        int num1 = console.nextInt();
//        int num2 = console.nextInt();
//        int num3 = console.nextInt();
//        int sum = num1 + num2 + num3;
//        System.out.println(sum);
//        System.out.println(sum / 3);
//        System.out.println((double)sum / 3);
//        console.close();

        // 6
//        console = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int myInt = console.nextInt();
//        System.out.println(myInt % 10);
//        console.close();

        // 7
        i = 27;
        j = 4;
        System.out.println(i / j);
        System.out.println((double)(i / j));
        System.out.println((double)i / j);

        // 8
        String name1 = "Gil";
        String name2 = "gil";
        System.out.println(name1.equals(name2));
        System.out.println(name1.toLowerCase().equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));

        // 9
        String name11 = "Gil";
        String name12 = " Gil ";
        System.out.println(name11.trim().equals(name12.trim()));

        // 10
        int myNum = 10;
        myNum++;
        System.out.println(myNum);
        myNum = myNum + 1;
        System.out.println(myNum);
        myNum += 1;
        System.out.println(myNum);

    }







}
