package Silver;

import java.util.Scanner;

public class Silver_1427 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();

		long gcd = getGCD(Math.max(A, B), Math.min(A, B));
		long lcm = getLCM(A, B, gcd);

		System.out.println(gcd);
		System.out.println(lcm);
	}

	public static long getGCD(long A, long B) {
		while (B > 0) {
			long t = A;
			A = B;
			B = t % B;
		}
		return A;
	}

	public static long getLCM(long A, long B, long gcd) {

		return (A * B) / gcd;
	}
}