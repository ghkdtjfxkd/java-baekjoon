package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if(n == 1){
            System.out.println("*");
        }else {
            for (int i = 0; i < n - 1; i++) {
                sb.append(" ");
            }
            sb.append("*").append("\n");
            for (int i = 1; i < n -1; i++) {
                for (int j = 0; j < n -i -1; j++) {
                    sb.append(" ");
                }
                sb.append("*");

                for (int j = 0; j < 2 * i - 1; j++) {
                    sb.append(" ");
                }
                sb.append("*").append("\n");
            }

            for (int i = 0; i < 2 * n - 1; i++) {
                sb.append("*");
            }
            System.out.print(sb);
        }

    }
}
