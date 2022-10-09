package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 수 정렬하기
public class Bronze_2750 {
    public static void main(String[] args) throws IOException {
        // bubble 정렬 버퍼 버전
        buffer();
        // bubble 정렬 스캐너 버전
        scanner();
    }


    public static void buffer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int t = 0; t < n; t++) {
            for (int j = t + 1; j < n; j++) {
                if (arr[t] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[t];
                    arr[t] = temp;
                }
            }
        }
        for (int m = 0; m < n; m++) {
            System.out.println(arr[m]);
        }
    }


    public static void scanner() {
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
