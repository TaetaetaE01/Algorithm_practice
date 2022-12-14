package Silver;
/*
Silver_1541 최솟값을 만드는 괄호 배치 찾기
그리디를 이용해 가장 큰 수를 찾고 그에 맞는 기호(+, -)를 스플릿하여 넣어 덧셈함
푼 날짜 : 2022. 12. 14.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1541 {

    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] str = input.split("-");

        for (int i = 0; i < str.length; i++) {
            int temp = sum(str[i]);

            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    public static int sum(String a) {
        int sum = 0;
        String temp[] = a.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
