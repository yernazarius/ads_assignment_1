import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt(), a = input.nextInt();
        int a = 2, n = 10;
        System.out.println(pow(a, n));
    }

    public static long pow(int a, int b) {
        if (b == 0) return 1;
        return a * pow(a, b - 1);
    }
}
