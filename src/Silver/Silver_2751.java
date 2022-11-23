package Silver;

import java.io.*;

public class Silver_2751 {

    public static int[] A, temp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        A = new int[N + 1];
        temp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(1, N);
        for (int i = 1; i <= N; i++) {
            bw.write(A[i] + "\n");
        }
        bw.flush();
        bw.close();

    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }
        int m = start + (end - start) / 2;

        // 재귀 함수 처럼 다시 함수 선언하여 그그그 스플릿 배열 쪼개기 해야함
        mergeSort(start, m);
        mergeSort(m + 1, end);
        for (int i = start; i <= end; i++) {
            temp[i] = A[i];
        }
        int k = start;
        int index1 = start;
        int index2 = m + 1;
        while (index1 <= m && index2 <= end) {
            if (temp[index1] > temp[index2]) {
                A[k] = temp[index2];
                k++;
                index2++;
            } else {
                A[k] = temp[index1];
                k++;
                index1++;
            }
        }
        while (index1 <= m) {
            A[k] = temp[index1];
            k++;
            index1++;
        }

        while (index2 <= end) {
            A[k] = temp[index2];
            k++;
            index2++;
        }

    }
}
