package Silver;

import java.util.Scanner;

public class silver_1436 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;

		sc.close();

		while (n > 0) {
			num++;
			String str = Integer.toString(num); // int to string Çüº¯È¯

			if (str.contains("666")) {
				n--;
			}
		}

		System.out.println(num);

	}
}
