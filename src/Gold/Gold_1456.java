package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_1456 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long[] temp = new long[10000001];

        for (int i = 2; i < temp.length; i++) {
            temp[i] = i;
        }


        for (int i = 2; i <= Math.sqrt(temp.length); i++) {
            if (temp[i] == 0) {
                continue;
            }
            for (int t = i + i; t < temp.length; t = t + i) {
                temp[t] = 0;
            }
        }
        int count = 0;
        for (int i = 2; i < temp.length; i++) {
            if (temp[i] != 0) {
                long tempS = temp[i];
                while ((double) temp[i] <= (double) b / (double) tempS) {
                    if ((double) temp[i] >= (double) a / (double) tempS) {
                        count++;
                    }
                    tempS *= temp[i];
                }
            }
        }
        System.out.println(count);
    }
}