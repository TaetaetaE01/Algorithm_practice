package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Gold_1707 {

    static ArrayList<Integer>[] A;
    static int[] check;
    static boolean visited[];
    static boolean IsEven;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int j = 0; j < N; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            IsEven = true;
            for (int i = 1; i <= V; i++) {
                A[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                A[start].add(end);
                A[end].add(start);
            }

            for (int i = 1; i <= V; i++) {
                if (IsEven) {
                    DFS(i);
                } else {
                    break;
                }
            }
            if (IsEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void DFS(int Node) {
        visited[Node] = true;
        for (int i : A[Node]) {
            if (!visited[i]) {
                check[i] = (check[Node] + 1) % 2;
                DFS(i);
            } else if (check[Node] == check[i]) {
                IsEven = false;
            }
        }
    }
}
