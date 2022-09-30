package Bronze;

import java.util.Scanner;

public class Bronze_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String input = sc.next();

        char[] arr = input.toCharArray();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i] - '0';
        }
        System.out.println(sum);
    }
}
