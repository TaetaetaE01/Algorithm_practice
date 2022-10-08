package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            int temp = Math.abs(a) - Math.abs(b);
            return temp == 0 ? a - b : temp;
        });

        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                sb.append((queue.isEmpty() ? 0 : queue.poll())).append("\n");
            } else {
                queue.add(input);
            }
        }
        System.out.println(sb.toString());
    }
}
