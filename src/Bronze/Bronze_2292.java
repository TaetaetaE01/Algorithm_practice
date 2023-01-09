package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        int range = 2;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) {
                range += 6 * count;
                count++;
            }
            System.out.println(count);
        }
    }
}