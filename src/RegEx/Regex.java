package RegEx;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String IP = in.next();
            String IP = "000.12.12.034";
            System.out.println(IP.matches(new MyRegex().pattern));
//        }

    }
}
    class MyRegex {
        String pattern;

        public MyRegex() {
            pattern = "^((([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))\\.){3}(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))$"; // ez jó
        }
    }

