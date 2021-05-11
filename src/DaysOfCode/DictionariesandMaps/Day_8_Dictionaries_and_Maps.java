package DaysOfCode.DictionariesandMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_8_Dictionaries_and_Maps {
    public static void main(String[] argh) throws FileNotFoundException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("src/HackerRank/DictionariesandMaps/nums"));
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            if (phoneBook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phoneBook.get(s));
            }
        }
        in.close();
    }
}
