package RegEx.BuildStackExchScraper;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuildScraper {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/RegEx/BuildStackExchScraper/text.txt"));
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            String line = s.nextLine().trim();
            Pattern pattern1 = Pattern.compile("((?<=href=\"\\/questions\\/)\\d{5})");
            Pattern pattern2 = Pattern.compile("((?<=class=\"question-hyperlink\">).*(?=<\\/a><\\/h3>))");
            Pattern pattern3 = Pattern.compile("((?<=class=\"relativetime\">).*(?=<\\/span>))");
            Matcher matcher1 = pattern1.matcher(line);
            Matcher matcher2 = pattern2.matcher(line);
            Matcher matcher3 = pattern3.matcher(line);
            while (matcher1.find()) {
                System.out.print(matcher1.group()+ ";");
            }
            while (matcher2.find()) {
                System.out.print(matcher2.group() + ";");
            }
            while (matcher3.find()) {
                System.out.println(matcher3.group());
            }
        }
    }
}
