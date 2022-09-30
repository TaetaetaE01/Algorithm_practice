package Bronze;

import java.util.Scanner;

public class Bronze_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int t = 0; t < size; t++) {
            arr[t] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];

        }
        System.out.println(sum * 100.0 / max / size);
    }
}
