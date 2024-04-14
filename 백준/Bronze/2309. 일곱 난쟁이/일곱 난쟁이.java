import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        int f1 = 0;
        int f2 = 0;

        for (int n = 0; n < arr.length; n++) {
            for (int m = n + 1; m < arr.length; m++) {
                if ((sum - (arr[n] + arr[m])) == 100) {
                    f1 = arr[n];
                    f2 = arr[m];
                }
            }
        }
        for (int t = 0; t < arr.length; t++) {
            if (arr[t] == f1 || arr[t] == f2) continue;
            System.out.println(arr[t]);
        }


    }
}