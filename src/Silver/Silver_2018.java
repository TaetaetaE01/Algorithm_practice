package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Silver_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();

        int sum = 1;
        int start_point = 1;
        int end_point = 1;
        int answer = 0;


        while (start_point <= end_point) {
            if (sum == N) {
                answer++;
            }
            if (sum < N) {
                end_point++;
                sum += end_point;
            } else if (sum >= N) {
                sum -= start_point;
                start_point++;
            }
        }
        System.out.println(answer);
    }
}
