package bronze.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11719 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String s;
        while ((s = br.readLine() )!= null) {
            System.out.println(s);
        }
        // 나는 계속 while문을 실행시키고 난 후에 입력을 받아 null 인지 체크를 했는데
        // 그런 방법으로는 이미 while문이 실행되었기 때문에 코드가 끝나지 않았다.
        // while문에 돌입하기 전 조건에서부터 null 체크를 하면 while문이 실행되지 않고 그대로 종료된다.
    }
}
