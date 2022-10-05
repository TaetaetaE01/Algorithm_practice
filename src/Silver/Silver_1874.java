package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 1;
        for (int t = 0; t < n; t++) {
            int recent = arr[t];
            if (recent >= num) {
                while (recent >= num) {
                    stack.push(num++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int top = stack.pop();
                if (top > recent) {
                    System.out.println("NO");
                    return;
                } else{
                    sb.append("-").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
