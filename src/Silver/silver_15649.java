package Silver;

import java.util.Scanner;

public class silver_15649 {

    private static int[] arr;
    private static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new int[M];
        visit = new boolean[N];

        dfs(N, M, 0);

    }

    //우선 깊이 탐색
    public static void dfs(int N, int M, int depth) {

        // 탐색의 깊이 끝 도달
        if (M == depth) {
            for (int result : arr) {
                System.out.print(result + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false; // 자식노드 방문 후 방문 노드 false 초기화
            }
        }
    }
}
