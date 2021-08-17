package Silver;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class silver_11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] point = new int[n][2];

		for (int i = 0; i < n; i++) {
			for (int l = 0; l < 2; l++) {
				point[i][l] = sc.nextInt();
			}
		}

		sc.close();

		// 이게 뭘까,,,,,,,,,,,,,,정말로
		Arrays.sort(point, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {

				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});

//		System.out.println();
//
//		for (int m = 0; m < n; m++) {
//			for (int b = 0; b < 2; b++) {
//				System.out.print(point[m][b] + " ");
//			}
//			System.out.println();
//		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(point[i][0] + " " + point[i][1]).append('\n');
		}
		System.out.println(sb);
	}

//	int[] xPoint = new int[n];
//	int[] yPoint = new int[n];
//
//	for (int i = 0; i < n; i++) {
//		xPoint[i] = sc.nextInt();
//		yPoint[i] = sc.nextInt();
//	}
//	sc.close();
//
//	for (int t = 0; t < n - 1; t++) {
//
//		if (xPoint[t] > xPoint[t + 1]) {
//			int tempX, tempY = 0;
//			tempX = xPoint[t + 1];
//			xPoint[t + 1] = xPoint[t];
//			xPoint[t] = tempX;
//
//			tempY = yPoint[t + 1];
//			yPoint[t + 1] = yPoint[t];
//			yPoint[t] = tempY;
//		}
//
//	}
//
//	for (int g = 0; g < n - 1; g++) {
//		if (xPoint[g] == xPoint[g + 1] && yPoint[g] > yPoint[g + 1]) {
//			int tempX1, tempY1 = 0;
//			tempX1 = xPoint[g + 1];
//			xPoint[g + 1] = xPoint[g];
//			xPoint[g] = tempX1;
//
//			tempY1 = yPoint[g + 1];
//			yPoint[g + 1] = yPoint[g];
//			yPoint[g] = tempY1;
//		}
//	}
//
//	for (int m = 0; m < n; m++) {
//		System.out.println(xPoint[m] + " " + yPoint[m]);
//	}
}
