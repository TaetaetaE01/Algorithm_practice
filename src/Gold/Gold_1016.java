package Gold;
/*
푼 날짜 : 2022. 12. 29.
제곱이 아닌 수 찾기
모르겠어 다시 풀어
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());

        int result = (int) (max - min + 1);
        int sqrt = (int) Math.sqrt(max); // 제곱근(루트)

        boolean[] check = new boolean[result]; // 제곱이 아닌수가 있는지 체크

        // 2의 제곱수인 4부터 result보다 작거나 같은 값까지 반복하기
        for (long i = 2; i <= sqrt; i++) {
            long squared = i * i; // 제곱수
            long start = min % squared == 0 ? min / squared : (min / squared) + 1;

            for (long j = start; j * squared <= max; j++) {
                check[(int) ((j * squared) - min)] = true;
            }
        }

        // count
        int count = 0;
        for (int i = 0; i < result; i++) {
            if (!check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
