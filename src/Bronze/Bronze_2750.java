package Bronze;

import java.util.Scanner;

// 수 정렬하기
public class Bronze_2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int t = 0; t < size - 1; t++) {
            for (int m = t + 1; m < size; m++) {
                if (arr[t] > arr[m]) {
                    int temp = arr[t];
                    arr[t] = arr[m];
                    arr[m] = temp;
                }
            }
        }

        for (int j = 0; j < size; j++) {
            System.out.println(arr[j]);
        }
    }

}
