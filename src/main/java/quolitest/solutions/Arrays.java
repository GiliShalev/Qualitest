package quolitest.solutions;

public class Arrays {

    public static void main( String[] args )
    {
        // 1
        int[] arr = new int[3];
        arr[1] = 2;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = arr[1];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 2
        String[] words = {"a", "b", "c"};
        System.out.println(words[0] + words[1] + words[2]);
        System.out.println(words[2] + words[1] + words[0]);

        // 3
        int[] arr1 = new int[3];
        arr1[0] = 6;
        arr1[1] = 8;
        arr1[2] = arr1[0] + arr1[1];
        System.out.println(arr1[2]);





    }


}
