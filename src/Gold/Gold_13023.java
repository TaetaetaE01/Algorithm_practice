package Gold;
/*
Gold_13023
친구 관계파악하기
푼 날짜 : 22. 12. 1.
DFS로 깊이 5 즉 친구라고 인정되는 깊이인 5까지 도달했을 때 1을 출력하고 그 기준 깊이에 도달하지 못할 시 0을 출력한다
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Gold_13023 {

    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println("1"); // depth가 5인 친구
        } else {
            System.out.println("0"); // depth가 5가 안됨
        }
    }

    static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        } else {
            visited[now] = true;
            for (int i : A[now]) {
                if (!visited[i]) {
                    DFS(i, depth + 1);
                }
            }
            visited[now] = false;
        }
    }
}
