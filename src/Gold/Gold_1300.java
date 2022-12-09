package Gold;
/*
Gold_1300
이진탐색으로 k번째의 최솟값 탐색
푼 날짜 = 2022. 12. 9.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_1300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        long low = 1;
        long high = K;

        while (low < high) {
            long middle = (low + high) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                // 최솟값 구하기 Math.min -> (x, y) 중 최솟값 리턴
                count += Math.min(middle / i, N);
            }

            if (K <= count) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        System.out.println(low);
    }
}
