package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] A = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            A[i] = i;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (A[j] == 0) {
                continue;
            }
            for (int t = j + j; t <= n; t = t + j) {
                A[t] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (A[i] != 0) {
                System.out.println(A[i]);
            }
        }
    }

//    public class Main {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//            StringTokenizer st = new StringTokenizer(bf.readLine());
//            StringBuilder sb = new StringBuilder();
//            int m = Integer.parseInt(st.nextToken());
//            int n = Integer.parseInt(st.nextToken());
//            boolean[] arr = new boolean[n + 1];
//            arr[0] = true;
//            arr[1] = true;
//            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
//                for (int j = 2; i * j <= n; j++) {
//                    arr[i * j] = true;
//                }
//            }
//
//            for (int i = m; i < arr.length; i++) {
//                if (!arr[i]) {
//                    sb.append(i + "\n");
//                }
//            }
//            System.out.println(sb);
//        }
//    }


}
