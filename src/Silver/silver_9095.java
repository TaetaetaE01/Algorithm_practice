package Silver;

import java.util.Scanner;

public class silver_9095 {

	private static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int t = 0; t < n; t++) {
			System.out.println(calculate(arr[t]));
		}
	}

	public static int calculate(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else if (n == 3) {
			return 4;
		} else {
			return calculate(n - 1) + calculate(n - 2) + calculate(n - 3);
		}
	}
}
