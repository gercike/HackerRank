public class StringReverse {
    public static void main(String[] args) {
        String A = "indulagorogaludni";
        System.out.println(isStringPalindrome(A));
    }

    public static String isStringPalindrome(String A) {
        for (int i = 0, j = A.length() - 1; i < A.length() / 2; i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                return "No";
            }
        }
        return "Yes";
    }
}
