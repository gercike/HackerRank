package List;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_ {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/List/nums.txt"));
        List<Integer> list = new ArrayList<>();
        int iter = s.nextInt();
        for (int i = 0; i < iter; i++) {
            list.add(s.nextInt());
        }
        int iter2 = s.nextInt();
        for (int i = 0; i < iter2; i++) {
            String st = s.next();
            if (st.equals("Insert")) {
                int idx = s.nextInt();
                int num = s.nextInt();
                list.add(idx, num);
            } else {
                int idx = s.nextInt();
                list.remove(idx);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
