
import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String text = input.next();
        String text = "123a12";
        if (allDigits(text.toCharArray())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean allDigits(char[] arr){
        return privateAllDigits(arr, 0);
    }

    private static boolean privateAllDigits(char[] arr, int i) {
        if(i == arr.length) return true;
        return Character.isDigit(arr[i]) && privateAllDigits(arr, i + 1);
    }
}