package Bronze;

import java.util.Scanner;
import java.util.StringTokenizer;

// 단어의 개수
public class Bronze_1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(test, " ");
        System.out.println(st.countTokens());
    }

}
