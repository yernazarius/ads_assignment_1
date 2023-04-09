import java.util.Scanner;
public class task_10 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt(), k = input.nextInt();
        int n = 32, k = 48;
        System.out.println(gcd(n, k));
    }

    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}