package Silver;

import java.util.Scanner;

public class silver_2606 {

	static int n, count;
	static boolean[][] pair;
	static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		pair = new boolean[n + 1][n + 1];
		visit = new boolean[n + 1];

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			pair[a][b] = pair[b][a] = true;
		}
		sc.close();

		dfs(1);
		System.out.println(count - 1);
	}

	public static void dfs(int t) {
		// true란 소리는 이미 밑의 과정을 거쳤단 소리
		if (visit[t]) {
			return;
		} else {
			visit[t] = true;
			// 연결된 컴퓨터 즉 재귀 호출 count
			count++;

			for (int s = 1; s <= n; s++) {
				// true면 위에서 입력 받은 컴퓨터 존재의 좌표? 개념임
				if (pair[t][s]) {
					dfs(s);
				}
			}
		}
	}
}
