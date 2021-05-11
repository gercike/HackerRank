package RegEx.Spelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsUkSpellingII {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/RegEx/Spelling/words2.txt"));
//        Scanner s = new Scanner(System.in);
        s.nextInt();
        s.nextLine();
        ArrayList<String> words = new ArrayList<>();
        while (!s.hasNextInt()) {
            words.add(s.next());
        }
        System.out.println(words);
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            int counter = 0;
            String wordUS = s.next();
            String wordsUK = wordUS.replace("our", "or");
            for (String word : words) {
                if (word.equals(wordUS) || word.equals(wordsUK)){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
