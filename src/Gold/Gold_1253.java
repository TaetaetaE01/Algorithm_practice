package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Gold_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        int answer = 0;
        for (int t = 0; t < N; t++) {
            int target = arr[t];
            int i = 0;
            int j = arr.length - 1;

            while (i < j) {
                if (arr[i] + arr[j] == target) {
                    // target이랑 비교하는 수는 같은 수가 와서는 안된다
                    // 다른 두 수의 합이여야한다
                    if (i != t && j != t) {
                        answer++;
                        break;
                    } else if (i == t) {
                        i++;
                    } else if (j == t) {
                        j--;
                    }
                } else if (arr[i] + arr[j] < target) {
                    i++;
                } else if (arr[i] + arr[j] > target) {
                    j--;
                }
            }
        }
        System.out.println(answer);
    }
}
