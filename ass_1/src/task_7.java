import java.util.Scanner;

public class task_7 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String text = input.next();
        String text = "XOI";
        permutations_of_string(text);
    }

    public static void permutations_of_string(String str) {
        recursiveSolution(str, 0, str.length());
    }
    private static void recursiveSolution(String string, int start, int end) {
        if (start == end - 1) {
            System.out.println(string);
        } else {
            for (int current = start; current < end; current++) {
                char[] x = string.toCharArray();
                char temp = x[start];
                x[start] = x[current];
                x[current] = temp;
                recursiveSolution(new String(x), start + 1, end);
                temp = x[start];
                x[start] = x[current];
                x[current] = temp;
            }
        }
    }
}

