package Gold;

/*
Gold_1167 트리의 지름
BFS이용하여 노드와 노드의 길이를 더해서 최댓값 구하기
푼 날짜 : 22. 12. 04.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Gold_1167 {

    static boolean visited[];
    static int[] distance;
    static ArrayList<Edge>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        A = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<Edge>();
        }

        for (int j = 0; j < N; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            while (true) {
                int E = Integer.parseInt(st.nextToken());
                if (E == -1) {
                    break;
                } else {
                    int V = Integer.parseInt(st.nextToken());
                    A[S].add(new Edge(E, V));
                }
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(1);
        int Max = 1;

        for (int i = 2; i <= N; i++) {
            if (distance[Max] < distance[i]) {
                Max = i;
            }
        }
        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(Max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    private static void BFS(int NodeIndex) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(NodeIndex);
        visited[NodeIndex] = true;

        while (!queue.isEmpty()) {
            int is_NowNode = queue.poll();

            for (Edge edge : A[is_NowNode]) {
                int e = edge.e;
                int v = edge.value;

                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[is_NowNode] + v;
                }
            }
        }
    }
}

class Edge {
    int e; // 기준 NODE
    int value; // 노드사이간 거리

    public Edge(int e, int value) {
        this.e = e;
        this.value = value;
    }
}