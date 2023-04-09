import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt(), k = input.nextInt();
        int n = 2, k = 1;
        System.out.println(binomialCoefficient(n, k));
    }
    public static long binomialCoefficient(int n, int k){
        return task_4.findFactorial(n) / (task_4.findFactorial(k) * task_4.findFactorial(n - k));
    }
}
