package Silver;

import java.io.*;
import java.util.*;

public class Silver_18352 {

    static int N, M, K, X;
    static ArrayList<Integer>[] A;
    static int[] visited;
    static List<Integer> answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        A = new ArrayList[N + 1];
        answer = new ArrayList<>();
        visited = new int[N + 1];

        // A에 각 노드에 새로운 ArrayList 생성
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        // 인접 리스트 data input
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
        }

        // 방문 배열 초기화
        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }

        BFS(X);

        for (int i = 0; i <= N; i++) {
            if (visited[i] == K) {
                answer.add(i);
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (answer.isEmpty()) {
            bw.write("-1 \n");
        } else {
            Collections.sort(answer);
            for (int temp : answer) {
                bw.write(temp + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node]++;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i : A[now]) {
                if (visited[i] == -1) {
                    visited[i] = visited[now] + 1;
                    queue.add(i);
                }
            }
        }
    }
}
