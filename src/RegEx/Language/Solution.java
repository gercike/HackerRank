package RegEx.Language;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        String languages = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC";
        String[] langs = languages.split(":");
//        Scanner s = new Scanner(new File("src/HackerRank/RegEx/Language/rows.txt"));
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        s.nextLine();
        for (int i = 0; i < rows; i++) {
            String row = s.nextLine();
//            System.out.println(row);
            String lang = row.substring(row.indexOf(" ")+1);
            for (int j = 0; j < langs.length; j++) {
                if (lang.equals(langs[j])){
                    System.out.println("VALID");
                    break;
                }
                if (j== langs.length-1){
                    System.out.println("INVALID");
                }
            }
        }
    }
}
