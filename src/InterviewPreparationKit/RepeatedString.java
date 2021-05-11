package InterviewPreparationKit;

public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a'){
                counter++;
            }
        }
        counter *= n / s.length();
        long leftover = n % s.length();
        if (leftover > 0){
            for (int i = 0; i < leftover; i++) {
                if (s.charAt(i) == 'a'){
                    counter++;
                }
            }
        }
        return counter;
    }
}
