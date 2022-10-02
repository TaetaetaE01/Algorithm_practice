package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gold_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] sum = new long[N];
        long[] left = new long[N];
        // 나머지 0, 1, 2 합에서 개수구하기
        long[] temp = new long[M];

        long answer = 0;

        st = new StringTokenizer(br.readLine());

        sum[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + Long.parseLong(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            left[i] = sum[i] % M;
            if (left[i] == 0) {
                answer++;
            }
            temp[(int) left[i]]++;
        }
        for (int t = 0; t < M; t++) {
            if (temp[t] > 0) {
                answer += (temp[t] * (temp[t] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
