package Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_1325 {
    static int N, M;
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        answer = new int[N + 1];

        // 인접 리스트 ArrayList로 생상
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        // 인접 리스트 데이터 넣기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
        }

        // 모든 Node BFS 탐색
        for (int i = 1; i <= N; i++) {
            // 모든 노드를 탐색해야하기 때문에 BFS 돌릴 때 마다 초기화 해줘야함
            visited = new boolean[N + 1];
            BFS(i);
        }

        int maxCom = 0;
        for (int i = 1; i <= N; i++) {
            maxCom = Math.max(answer[i], maxCom);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= N; i++) {
            if(answer[i] == maxCom){
                bw.write(i + " ");
            }
        }
        bw.flush();
        bw.close();
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : A[now]) {
                if (visited[i] == false) {
                    visited[i] = true;
                    answer[i]++;
                    queue.add(i);
                }
            }
        }
    }
}
