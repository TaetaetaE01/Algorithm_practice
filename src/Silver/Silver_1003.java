package Silver;

import java.util.Scanner;

public class Silver_1003 {

	static int countZ = 0;
	static int countO = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int t = sc.nextInt();
			fibonacci(t);
		}
		for (int m = 0; m < n; m++) {
			System.out.println(countZ + " " + countO);
		}
	}

	public static int fibonacci(int t) {

		if (t == 0) {
			countZ++;
			return 0;
		} else if (t == 1) {
			countO++;
			return 1;
		} else {
			return fibonacci(t - 1) + fibonacci(t - 2);
		}
	}
}
