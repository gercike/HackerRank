package RegEx.DetectHTML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DetectHTMLLinks {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/RegEx/DetectHTML/lines1.txt"));
        //((?<=href=").*(?=" ))([\s*\w*]*(?=<\/a))
    }
}
