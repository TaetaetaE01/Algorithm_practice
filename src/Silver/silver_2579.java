package Silver;

import java.util.Scanner;

public class silver_2579 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n + 1];
		int[] sum = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		// 계단 1개일 경우
		sum[1] = arr[1];

		// 계단이 2개일 때 경우의 수는 한 가지
		if (n >= 2) {
			sum[2] = arr[1] + arr[2];
		}

		// 계단 3개 넘을 경우
		for (int t = 3; t <= n; t++) {
			sum[t] = Math.max(sum[t - 2], sum[t - 3] + arr[t - 1]) + arr[t];
		}
		System.out.println(sum[n]);
	}
}
