package bronze.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27866 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String inputStr = br.readLine();
        int inputNum = Integer.parseInt(br.readLine());
        System.out.println(inputStr.charAt(inputNum-1));
    }
}
