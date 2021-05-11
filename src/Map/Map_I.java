package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_I {
    public static void main(String[] argh) throws FileNotFoundException {
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("src/HackerRank/Map/data.txt"));
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}