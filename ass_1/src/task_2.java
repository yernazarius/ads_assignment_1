
import java.util.Scanner;

class task_2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = input.nextInt();
//        }

        int[] arr = new int[]{3, 2, 4, 1};
        System.out.println(findAverage(arr));
    }

    public static double findAverage(int[] arr){
        if(arr.length == 0) return 0;
        return findSum(arr, arr.length) / arr.length;
    }
    private static double findSum(int[] arr, int i){
        if(i == 0) return 0;
        return  findSum(arr, i - 1 ) + arr[i - 1];
    }
}