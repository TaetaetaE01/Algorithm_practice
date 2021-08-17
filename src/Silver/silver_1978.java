package Silver;

import java.util.Scanner;

public class silver_1978 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberCount = sc.nextInt();
		int count = 0;
		int subCount = 0;

		for (int i = 1; i <= numberCount; i++) {

			// for문 돌때 마다 count 초기화 해줘야한다.
			subCount = 0;
			int n = sc.nextInt();

			for (int t = 1; t <= n; t++) {
				if (n % t == 0) {
					subCount++;
				}
			}
			if (subCount == 2) {
				count++;
			}
		}

		sc.close();

		System.out.println(count);

	}
}
