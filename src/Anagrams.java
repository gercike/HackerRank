import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {


    static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()){
            return false;
        }
        char[] aList = new char[a.length()];
        char[] bList = new char[b.length()];
        for (int i = 0; i < a.length(); i++) {
            aList[i] = Character.toLowerCase(a.charAt(i));
        }
        for (int i = 0; i < b.length(); i++) {
            bList[i] = Character.toLowerCase(b.charAt(i));
        }
        for (int i = 1; i < aList.length; ) {
            if (aList[i] < aList[i - 1]) {
                char temp = aList[i - 1];
                aList[i - 1] = aList[i];
                aList[i] = temp;
                if (i > 1) {
                    i--;
                }
            } else {
                i++;
            }
        }
        for (int i = 1; i < bList.length; ) {
            if (bList[i] < bList[i - 1]) {
                char temp = bList[i - 1];
                bList[i - 1] = bList[i];
                bList[i] = temp;
                if (i > 1) {
                    i--;
                }
            } else {
                i++;
            }
        }
        System.out.println(aList);
        System.out.println(bList);
        for (int i = 0; i < aList.length; i++) {
            if (aList[i] != bList[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        String a = "Ygguuggggga";
        String b = "WAAbbccbbbbbbba";
//        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}



