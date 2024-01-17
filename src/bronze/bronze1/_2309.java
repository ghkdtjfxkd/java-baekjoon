package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> heightList = new ArrayList<>();
        List<Integer> trueDwarf = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            heightList.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 9; i++) {
            List<Integer> testList = heightList.stream().collect(Collectors.toList());
            testList.set(8 - i, 0);
            System.out.println(testList);
            System.out.println("----");

            for (int j = 1; j < 8 ; j++) {
                testList.set(8 - j, 0);

                System.out.println(testList);


                if (testList.stream().mapToInt(n -> n).sum() == 100) {
                    trueDwarf = testList;
                    break;
                }
                testList.set(8 - j, heightList.get(8-j));
            }System.out.println("-------");
        }
        trueDwarf.stream().filter(n -> n != 0).sorted().forEach(System.out::println);
    }
}
