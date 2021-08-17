package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class silver_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Integer[] temp = new Integer[n];

		for (int i = 0; i < n; i++) {
			temp[i] = sc.nextInt();
		}
		sc.close();

		int waitTime = 0;
		int subWaitTime = 0;

		Arrays.sort(temp);

		for (int m = 0; m < n; m++) {
			waitTime += temp[m];
			subWaitTime += waitTime;
		}

		System.out.println(subWaitTime);
	}
}
