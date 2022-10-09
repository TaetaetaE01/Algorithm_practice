package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Gold_1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        data[] arr = new data[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new data(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i].value > arr[j].value) {
//                    int tempValue = arr[j].value;
//                    int tempIndex = arr[j].index;
//
//                    arr[j].value = arr[i].value;
//                    arr[j].index = arr[i].index;
//
//                    arr[i].value = tempValue;
//                    arr[i].index = tempIndex;
//                }
//            }
//        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }
        System.out.println(max + 1);
    }

    static class data implements Comparable<data> {
        int value;
        int index;

        public data(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(data o) {
            return this.value - o.value;
        }
    }
}

