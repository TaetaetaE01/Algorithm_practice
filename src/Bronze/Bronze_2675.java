package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < count; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();

//            String[] str = br.readLine().split(" ");	// 공백 분리
//
//            int R = Integer.parseInt(str[0]);	// String -> int
//            String S = str[1];
//
//            for(int j = 0; j < S.length(); j++) {
//                for(int k = 0; k < R; k++) {
//                    System.out.print(S.charAt(j));
//                }
//            }
//            System.out.println();
        }
    }
}
