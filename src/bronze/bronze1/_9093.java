package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9093 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
//        List<String> reverseStringList = new ArrayList<>();
//        String test = "S";
//        for (int i = 0; i < testCase; i++) {
//            String[] input = br.readLine().split(" ");
//            for (String s : input) {
//                StringBuilder sb = new StringBuilder(s);
//                reverseStringList.add(String.valueOf(sb.reverse()));
//            }
//            reverseStringList.stream().filter(n -> reverseStringList.indexOf(n) != reverseStringList.size()-1).forEach(
//                    n -> System.out.print(n + " "));
//            System.out.print(reverseStringList.get(reverseStringList.size()-1));
//            reverseStringList.clear();
//        }

        for (int i = 0; i < testCase; i++) {
            String[] strList = br.readLine().split(" ");

            for (String s : strList) {
                StringBuilder sb = new StringBuilder(s);
                System.out.print(sb.reverse() + " ");
            }
        }
    }
}
