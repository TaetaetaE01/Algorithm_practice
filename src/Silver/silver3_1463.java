package Silver;
import java.util.Scanner;

public class silver3_1463 {

	static Integer[] temp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		temp = new Integer[n + 1];
		sc.close();

		// 재귀 탈출시킬려는 세팅,,?
		temp[0] = temp[1] = 0;

		System.out.print(calculate(n));
	}

	public static int calculate(int n) {

		// 한번도 통과 못한 배열일 때
		if (temp[n] == null) {
			// n이 6의 배수일 때
			if (n % 6 == 0) {
				temp[n] = Math.min(calculate(n - 2), Math.min(calculate(n / 3), calculate(n / 2))) + 1;
			} else if (n % 3 == 0) { // 3의 배수일 때
				temp[n] = Math.min(calculate(n / 3), calculate(n - 1)) + 1;
			} else if (n % 2 == 0) { // 2의 배수일 때
				temp[n] = Math.min(calculate(n / 2), calculate(n - 1)) + 1;
			} else { // 2와 3의 배수도 아닐 때
				temp[n] = calculate(n - 1) + 1;
			}
		}
		return temp[n];
	}
}