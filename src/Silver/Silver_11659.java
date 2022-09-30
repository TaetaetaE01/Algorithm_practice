package Silver;

import java.util.Scanner;

public class Silver_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();


        int[] sum = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            sum[i] = sum[i - 1] + sc.nextInt();
        }
        // s부터 f까지의 합을 구하여라
        for (int t = 0; t < n; t++) {
            int s = sc.nextInt();
            int f = sc.nextInt();
            System.out.println(sum[f] - sum[s - 1]);
        }

    }
}
