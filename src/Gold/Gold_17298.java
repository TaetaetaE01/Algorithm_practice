package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int t = 0; t < n; t++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[t]) {
                answer[stack.pop()] = arr[t];
            }
            stack.push(t);
        }
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < n; j++) {
            sb.append(answer[j] + " ");
        }
        System.out.println(sb);
    }
}
