package DaysOfCode.Day28;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegExPatternsEtc {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/HackerRank/DaysOfCode/Day28/rows.txt"));
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<String> gmailers = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");
            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            if (emailID.matches("^\\S*@gmail\\.com$")){
                gmailers.add(firstName);
            }
        }
        scanner.close();
        Collections.sort(gmailers);
        for (String gmailer : gmailers) {
            System.out.println(gmailer);
        }
    }
}
