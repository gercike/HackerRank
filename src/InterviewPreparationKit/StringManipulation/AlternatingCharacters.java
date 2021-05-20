package InterviewPreparationKit.StringManipulation;

public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        if (s.length() > 1) {
            int counter = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    counter++;
                }
            }
            return counter;
        }
        return 0;
    }
}
