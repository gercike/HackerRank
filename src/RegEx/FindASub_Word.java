package RegEx;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASub_Word {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
//        Scanner s = new Scanner(new File("src/HackerRank/RegEx/findasubword.txt"));
        int numOfSentences = Integer.parseInt(s.nextLine());
//        ArrayList<String> sentences = new ArrayList<>();
//        for (int i = 0; i < numOfSentences; i++) {
//            sentences.add(s.nextLine());
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOfSentences; i++) {
            sb.append(s.nextLine()).append(" ");
        }
        int numOfQueries = Integer.parseInt(s.nextLine());
//        ArrayList<String> queries = new ArrayList<>();
        for (int i = 0; i < numOfQueries; i++) {
//            queries.add(s.nextLine());
            int counter = 0;
            String regex = "[\\w]+" + s.nextLine() + "[\\w]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb);
            while (matcher.find()) {
                counter++;
            }
            System.out.println(counter);
        }
    }
}
