package Bronze;

import java.util.Scanner;

public class Bronze_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int card[] = new int[N];

		for (int i = 0; i < N; i++) {
			card[i] = sc.nextInt();
		}
		sc.close();

		int result = 0;

		for (int f = 0; f < N - 2; f++) {
			for (int s = f + 1; s < N - 1; s++) {
				for (int t = s + 1; t < N; t++) {
					int sum = card[f] + card[s] + card[t];

					if (sum <= M && result < sum) {
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
	}
}
