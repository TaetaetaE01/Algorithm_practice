package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 이건 counting sort 방법으로 한 것 -> 백준상에선 시간초과 남
// 다른 counting sort 방법으로 다시해야함 or ArrayList sort 사용하면 간신히 시간초과 안난다고함 일단은 그래,,
public class Bronze_10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int[] data = new int[size];
        int[] cnt = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }
        for (int m = 0; m < size; m++) {
            cnt[data[m]]++;
        }

        int index = 0;
        for (int t = 0; t < size; t++) {
            if (cnt[t] != 0) {
                int j = 0;
                while (j < cnt[t]) {
                    j++;
                    data[index] = t;
                    index++;
                }
            }
        }

        for (int u = 0; u < size; u++) {
            System.out.println(data[u]);
        }
    }
}
