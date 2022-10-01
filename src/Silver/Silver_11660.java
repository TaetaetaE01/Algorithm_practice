package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 구간 합 구하기 -> 2차원 배열의 구간 합을 dp를 이용해 전체 합을 먼저 구한 뒤 계산하여 부분 합 구하기
public class Silver_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(st.nextToken());
        // 계산해야 하는 횟수
        int m = Integer.parseInt(st.nextToken());
        int[][] dp = new int[size + 1][size + 1];

        for (int i = 1; i <= size; i++) {
            // 범위 저장
            st = new StringTokenizer(br.readLine());
            // dp에 범위 합 저장
            for (int j = 1; j <= size; j++) {
                dp[i][j] = dp[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }

        for (int k = 1; k <= m; k++) {
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int i = x1; i <= x2; i++) {
                sum = sum + (dp[i][y2] - dp[i][y1 - 1]);
            }
            sb.append(sum + " ");
        }
        System.out.print(sb);
    }
}
