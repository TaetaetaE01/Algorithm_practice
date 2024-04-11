import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] apartment = new int[15][15];

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int total = 0;

            // 0층 세팅
            // 각층 1호는 무조건 1명
            for (int m = 1; m <= 14; m++) {
                apartment[0][m] = m;
                apartment[m][1] = 1;
            }

            // 1층부터 14층
            // 2호부터 14호까지
            for (int floor = 1; floor < 15; floor++) {
                for (int roomNum = 2; roomNum <= 14; roomNum++) {
                    apartment[floor][roomNum] = apartment[floor - 1][roomNum] + apartment[floor][roomNum - 1];
                    // 1층 2호 (3) = 0층 2호(2) + 1층1호(1)
                    // 1층 3호 (6) = 0층 3호(3) + 1층2호(3)
                }
            }
            System.out.println(apartment[k][n]);
        }
    }
}