package Silver;

import java.util.Scanner;

public class silver_11726 {

	static int[] arr;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		arr = new int[1001];

		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		
		sc.close();

		System.out.println(tile(n));
	}

	public static int tile(int yData) {
		for (int i = 3; i <= yData; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
		}

		return arr[yData];
	}
}
