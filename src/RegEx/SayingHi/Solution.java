package RegEx.SayingHi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/RegEx/SayingHi/sentences2.txt"));
//        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        Pattern pattern = Pattern.compile("^[hH][Ii]\\s[^Dd]");
        Matcher matcher;
        for (int i = 0; i <= rows; i++) {
            String row = s.nextLine();
            matcher = pattern.matcher(row);
            while (matcher.find()){
                System.out.println(row);
            }
        }
    }
}
