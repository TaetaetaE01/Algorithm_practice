package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2562 {
    static int KEYNUM = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[KEYNUM];

        for (int i = 0; i < KEYNUM; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int thatCount = 0;
        int max = 0;
        for (int num : arr) {
            count++;
            if (num > max) {
                max = num;
                thatCount = count;
            }
        }
        System.out.println(max);
        System.out.println(thatCount);
    }
}
