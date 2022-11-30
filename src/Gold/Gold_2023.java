package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Gold - 2023 : 신기한 소수 찾기
푼 날짜 : 2022. 11. 30.
DFS 재귀 사용하여 자리수 늘려가면서 찾기
 */
public class Gold_2023 {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        // 일의 자리 소수는 2 3 5 7 이므로 4개 수에서만 시작
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int num, int j) {
        if (j == N) {
            if (isPrime(num)) {
                System.out.println(num);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) { // 짝수이면 더 이상 탐색할 필요가 없음
                continue;
            }
            if (isPrime(num * 10 + i)) { // 소수이면 재귀로 자리수를 늘려갑니다.
                DFS(num * 10 + i, j + 1);
            }
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}