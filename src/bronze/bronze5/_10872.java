package bronze.bronze5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        bw.write(String.valueOf(factorial(input)));
        bw.flush();
    }

    static int factorial (int n){
        if(n == 0){
            return 1;
        } else{
            return n * factorial(n -1);
        }
    }
}
