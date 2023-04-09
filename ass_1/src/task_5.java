import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int n = 17;

        System.out.println(fib(n));
    }

    public static int fib(int n){
        if(n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
