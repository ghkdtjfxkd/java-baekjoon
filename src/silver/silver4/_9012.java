package silver.silver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int times = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < times; i++) {

            String input = sc.nextLine();
            List<String> st =  new ArrayList<>(List.of(input.split("")));

            long first = st.stream().filter(s -> s.equals("(")).count();
            long second = st.stream().filter(s -> s.equals(")")).count();


            if(first!= second){
                System.out.println("NO");
                continue;
            }

            while (input.contains("()")){
                if(input.contains("()")){
                    input = input.replace("()","");
                }
            }

            if(input.isEmpty()){
                System.out.println("YES");
            }

            if(!input.isEmpty()){
                System.out.println("NO");
            }

        }
    }
}
