import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int[] arr = new int[n];
//
//        for(int i = 0; i < n; i++){
//            arr[i] = input.nextInt();
//        }
        int[] arr = new int[]{10, 1, 32, 3, 45};

        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) return 0;
        return recursiveSolution(arr, Integer.MAX_VALUE, 0);
    }
    private static int recursiveSolution(int[] arr, int min, int i) {
        if (i == arr.length) return min;
        return recursiveSolution(arr, Integer.min(min, arr[i]), i + 1);
    }
}
