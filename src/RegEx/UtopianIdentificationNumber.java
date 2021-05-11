package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtopianIdentificationNumber {
    public static void main(String[] args) {
//        String line = "abc012333ABCDEEEE";
//        String line2 = "0123AB";
        Scanner s = new Scanner(System.in);
        int iter = s.nextInt();
        for (int i = 0; i < iter; i++) {
            String line = s.next();
            String regex = "^[a-z]{0,3}[\\d]{2,8}[A-Z]{3,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                System.out.println("VALID");
            } else{
                System.out.println("INVALID");
            }
        }
    }
}
