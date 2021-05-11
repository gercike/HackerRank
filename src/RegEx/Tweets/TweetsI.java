package RegEx.Tweets;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TweetsI {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/RegEx/Tweets/rows.txt"));
        Scanner s = new Scanner(System.in);
        int iters = s.nextInt();
        s.nextLine();
        int counter = 0;
        for (int i = 0; i < iters; i++) {
            String row = s.nextLine();
            Pattern regex = Pattern.compile("[Hh][Aa][cC][kK][eE][rR][rR][aA][nN][kK]");
            Matcher matcher = regex.matcher(row);
            while (matcher.find()){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
