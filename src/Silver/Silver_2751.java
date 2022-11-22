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

        for(int i = 1; i <= N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

    }
}
