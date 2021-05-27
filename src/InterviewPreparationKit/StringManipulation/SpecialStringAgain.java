package InterviewPreparationKit.StringManipulation;

public class SpecialStringAgain {
    static long substrCount(int n, String s) {
        long counter = n;
        char reference = s.charAt(0);
        int sequence = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                if (s.charAt(i) == reference) {
                    sequence++;
                    counter += sequence;
                } else {
                    reference = s.charAt(i);
                    sequence = 0;
                }
                if (i < s.length() - 1) {
                    int j = 1;
                    if (s.charAt(i) != s.charAt(i - j) && s.charAt(i - j) == s.charAt(i + j)) {
                        char same = s.charAt(i - j);
                        while (i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j) && s.charAt(i - j) == same) {
                            counter++;
                            j++;
                        }
                    }
                }
            }
        }
        return counter;
    }
}
