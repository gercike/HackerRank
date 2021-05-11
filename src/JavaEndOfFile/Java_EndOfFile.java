package JavaEndOfFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java_EndOfFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/JavaEndOfFile/Java End-of-file.txt"));
        int counter = 1;
        while (s.hasNextLine()){
            System.out.println(counter + " " + s.nextLine());
            counter++;
        }
    }
}
