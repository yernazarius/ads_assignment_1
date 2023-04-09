import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int n = 16;

        System.out.println(findFactorial(n));
    }
    public static long findFactorial(int n){
        return recursiveSolution(n);
    }
    private static long recursiveSolution(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursiveSolution(n - 1);
        }
    }
}
