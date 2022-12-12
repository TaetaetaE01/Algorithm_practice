package Gold;

/*
Gold_1715 수 묶기
그리디로 이용해 가장 큰 수 찾기
푼 날짜 : 2022. 12. 12.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Gold_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pqPlus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pqMinus = new PriorityQueue<>();

        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 1) {
                pqPlus.add(input);
            } else if (input < 0) {
                pqMinus.add(input);
            } else if (input == 0) {
                zero++;
            } else if (input == 1) {
                one++;
            }
        }
        int answer = 0;
        while (pqPlus.size() > 1) {
            int data1 = pqPlus.poll();
            int data2 = pqPlus.poll();
            answer += data1 * data2;
        }
        if (!pqPlus.isEmpty()) {
            answer += pqPlus.poll();
        }

        while (pqMinus.size() > 1) {
            int data1 = pqMinus.poll();
            int data2 = pqMinus.poll();
            answer += data1 * data2;
        }
        if (!pqMinus.isEmpty()) {
            if (zero == 0) {
                answer += pqMinus.poll();
            }
        }

        answer += one;
        System.out.println(answer);
    }
}
