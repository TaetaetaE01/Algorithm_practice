package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if(input >= 90){
            System.out.println("A");
        } else if(80 <= input && input <= 89 ){
            System.out.println("B");
        } else if(70 <= input && input <= 79 ){
            System.out.println("C");
        }else if(60 <= input && input <= 69 ){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
