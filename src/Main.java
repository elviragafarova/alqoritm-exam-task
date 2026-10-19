import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //41
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println(n + " is even.");
//        } else {
//            System.out.println(n + " is odd.");
//        }
//
//        //42
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        //43
//        //massivin max tap
//        int arr1[] = {2, 4, 6, 45, 6};
//        int max = arr1[0];
//        for (int i = 0; i < arr1.length - 1; i++) {
//            if(arr1[i] >= arr1[i+1]) {
//                max = arr1[i];
//            }
//            System.out.println(max);
//        }
//
//        //45
//        System.out.print("Enter a number: ");
//        int m = sc.nextInt();
//
//        int faktorial = 1;
//        for (int i = 1; i <= m; i++) {
//            faktorial = faktorial * i;
//        }
//        System.out.println("Faktorial: " + faktorial);
//
//        //46
//        String text = "Elvira";
//        String result = " ";
//
//        for (int i = text.length() - 1; i >= 0; i--) {
//            result += text.charAt(i);
//        }
//        System.out.println(result);
//
//
//        //47
//        String s = "level";
//        String reverse = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reverse += s.charAt(i);
//        }
//        if (s.equals(reverse)) {
//            System.out.println("palindrom");
//        }

        //48
        int sum1 = 0;
        int[] arr2 = {5, 2, 8, 1, 7, 4};
        for (int i = 0; i < arr2.length; i++) {
            sum1 += arr2[i];
        }
        System.out.println(sum1);
        System.out.println(sum1/arr2.length);

        //49
        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            if (i % 5 == 0){
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            System.out.println(i);
        }


        //50
        int[] arr = {5, 2, 8, 1, 7, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //44
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}