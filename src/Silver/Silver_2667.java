package Silver;

/*
푼 날짜 : 2022. 12. 26.
BFS이용하여 단지 수 COUNT if 단지가 있을 때 부터 BFS 돌리기 시작
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_2667 {
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean[][] visited;
    static int[][] map;
    static int N;

    static LinkedList<Integer> count = new LinkedList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        visited = new boolean[N][N];
        map = new int[N][N];

        // map에 데이터 넣기
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(temp.substring(j, j + 1));
            }
        }

        int danzi_count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && visited[i][j] == false) {
                    BFS(i, j);
                    danzi_count++;
                }
            }
        }
        // 단지 수
        System.out.println(danzi_count);
        // 오름차순 정렬
        Collections.sort(count);
        for (int ouput : count) {
            System.out.println(ouput);
        }
    }

    private static void BFS(int i, int j) {
        int gagu_count = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            int nowDate[] = queue.poll();
            for (int k = 0; k < 4; k++) {
                int x = nowDate[0] + dx[k];
                int y = nowDate[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        visited[x][y] = true;
                        map[x][y] = map[nowDate[0]][nowDate[1]] + 1;
                        queue.add(new int[]{x, y});
                        gagu_count++;
                    }
                }
            }
        }
        count.add(gagu_count);
    }
}
