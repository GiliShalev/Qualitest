package quolitest.solutions;


import java.io.Console;
import java.util.Scanner;

public class Conditions {

    public static void main( String[] args )
    {


        // 1
//        Scanner console = new Scanner(System.in);
//        System.out.println("Please enter age: ");
//        int age = console.nextInt();
//        if(age <= 18)
//            System.out.println("Teen");
//        if (age > 18 && age < 60)
//            System.out.println("Adult");
//        if(age >= 60)
//            System.out.println("Senior");
//
//        if(age <= 18)
//            System.out.println("Teen");
//        else if (age < 60)
//            System.out.println("Adult");
//        else
//            System.out.println("Senior");
//        console.close();

        // 2
//        Scanner console1 = new Scanner(System.in);
//        System.out.println("Please enter age: ");
//        int age1 = console1.nextInt();
//        System.out.println("Please enter gender (M/F): ");
//        String gender = console1.next();
//        if(age1 <= 18) {
//            if (gender.equalsIgnoreCase("F"))
//                System.out.println("Female teen");
//            else
//                System.out.println("Male teen");
//        }
//        else if (age1 < 60) {
//            if (gender.equalsIgnoreCase("F"))
//                System.out.println("Female adult");
//            else
//                System.out.println("Male adult");
//        }
//        else {
//            if (gender.equalsIgnoreCase("F"))
//                System.out.println("Female senior");
//            else
//                System.out.println("Male sednior");
//        }
//
//
//        if(age1 <= 18 && gender.equalsIgnoreCase("F"))
//            System.out.println("Female teen");
//        else if(age1 <= 18 && gender.equalsIgnoreCase("M"))
//            System.out.println("Male teen");
//        else if (age1 < 60 && gender.equalsIgnoreCase("F"))
//            System.out.println("Female adult");
//        else if (age1 < 60 && gender.equalsIgnoreCase("M"))
//            System.out.println("Male adult");
//        else if (gender.equalsIgnoreCase("F"))
//            System.out.println("Female senior");
//        else
//            System.out.println("Male sednior");
//
//        console1.close();

        // 3
        Scanner moreConsole = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        short num3 = moreConsole.nextShort();
        if(num3 % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


        // 4
//        Scanner console2 = new Scanner(System.in);
//        String day = "";
//        System.out.println("Please enter a number: ");
//        int num = console2.nextInt();
//        switch (num){
//            case 1:
//                day = "Sun";
//                break;
//            case 2:
//                day = "Mon";
//                break;
//            case 3:
//                day = "Tue";
//                break;
//            case 4:
//                day = "Wed";
//                break;
//            case 5:
//                day = "Thu";
//                break;
//            case 6:
//                day = "Fri";
//                break;
//            case 7:
//                day = "Sat";
//                break;
//            default:
//                day = "Valid values are 1-7";
//                break;
//
//        }
//        System.out.println(day);
//        console2.close();

        // 5
//        Scanner console3 = new Scanner(System.in);
//        System.out.println("Please enter an option from 1-6: ");
//        System.out.println("1 – Withdraw without a note");
//        System.out.println("2 – Withdraw with a note");
//        System.out.println("3 – Balance inquiry");
//        System.out.println("4 – Cash deposit");
//        System.out.println("5 – Check deposit");
//        System.out.println("6 – Exit");
//        int action = console3.nextInt();
//        switch (action){
//            case 1, 2:
//                System.out.println("Please select amount");
//                break;
//            case 3:
//                System.out.println("Your balance is 1000 NIS");
//                break;
//            case 4:
//                System.out.println("Please insert bills");
//                break;
//            case 5:
//                System.out.println("Please insert checks");
//                break;
//            case 6:
//                break;
//            default:
//                System.out.println("Valid values are 1-6");
//                break;
//
//        }
//        console3.close();
    }

}
