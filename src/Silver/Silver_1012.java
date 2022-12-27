package Silver;
/*
푼 날짜 : 2022. 12. 27.
N*M의 땅을 만들고, DFS로 배추를 심고 그 배추가 모여있는 곳을 COUNT
BFS로도 다시 트라이해볼 수 있음 두 가지 방법
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1012 {

    static int[][] ground;
    static boolean[][] visited;
    static int testCase;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int count;
    static int M, N, K;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < testCase; i++) {
            count = 0;
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());

            ground = new int[M][N];
            visited = new boolean[M][N];

            K = Integer.parseInt(st.nextToken());

            for (int u = 0; u < K; u++) {
                st = new StringTokenizer(br.readLine(), " ");
                int g1 = Integer.parseInt(st.nextToken());
                int g2 = Integer.parseInt(st.nextToken());

                ground[g1][g2] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (ground[x][y] == 1 && visited[x][y] == false) {
                        DFS(x, y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void DFS(int x, int y) {
        visited[x][y] = true;
        for (int k = 0; k < 4; k++) {
            int cx = x + dx[k];
            int cy = y + dy[k];

            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (ground[cx][cy] == 1 && !visited[cx][cy]) {
                    DFS(cx, cy);
                }
            }
        }
    }
}
