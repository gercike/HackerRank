package PatternSyntaxChecker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/HackerRank/PatternSyntaxChecker/regex.txt"));
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            testCases--;
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
            } catch (Exception e) {
                System.out.println("Invalid");
                continue;
            }
            System.out.println("Valid");
        }
    }
}
