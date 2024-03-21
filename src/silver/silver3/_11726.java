package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11726 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        System.out.println(recur(n));
    }

    static int recur(int n) {

        if(dp[n] == null){
            if(n == 0){
                dp[n] = 1;
            } else if(n == 1){
                dp[n] = 1;
            } else {
                dp[n] = recur(n-1) + recur(n-2);
            }
        }
        return dp[n] % 10007;
    }
}
