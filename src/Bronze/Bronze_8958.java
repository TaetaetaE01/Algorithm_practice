package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int textCount = Integer.parseInt(br.readLine());    //테스트 케이스

        String arr[] = new String[textCount];

        for (int i = 0; i < textCount; i++) {
            arr[i] = br.readLine();
        }

        for (int t = 0; t < textCount; t++) {
            int score = 0;
            int answer = 0;

            for (int i = 0; i < arr[t].length(); i++) {
                if (arr[t].charAt(i) == 'O') {
                    score++;
                } else {
                    score = 0;
                }
                answer += score;
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}
