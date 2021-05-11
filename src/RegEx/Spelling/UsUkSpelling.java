package RegEx.Spelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsUkSpelling {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/RegEx/Spelling/words.txt"));
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
            String wordsUK = wordUS.replace(wordUS.substring(wordUS.lastIndexOf("ze")), "se");
            for (String word : words) {
                if (word.equals(wordUS) || word.equals(wordsUK)){
                    counter++;
                }
            }
            System.out.println(counter);
        }
//        List<String> sentences = new ArrayList<>();
//        s.nextInt();
//        while (!s.hasNextInt()) {
//            sentences.add(s.next());
//        }
//        s.nextInt();
//        ArrayList<String> wordsUS = new ArrayList<>();
//        while (s.hasNext()){
//            wordsUS.add(s.next());
//        }
//        ArrayList<String> wordsUK = new ArrayList<>();
//        for (String us : wordsUS) {
//            int idx = us.lastIndexOf("ze");
//            wordsUK.add(us.replace(us.substring(idx), "se"));
//        }
//        int counter = 0;
//        for (String sentence : sentences) {
//            if (sentence.contains("se") || sentence.contains("ze")){
//                for (String us : wordsUS) {
//                    if (us.equals(sentence)){
//                        counter++;
//                    }
//                }
//                for (String s1 : wordsUK) {
//                    if (s1.equals(sentence)){
//                        counter++;
//                    }
//                }
//            }
//        }
//        System.out.println(counter);
    }
}
