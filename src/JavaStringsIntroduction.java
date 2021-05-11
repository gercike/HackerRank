import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
        String A = "hello";
        String B = "java";
//        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        A = A.replace(A.charAt(0), Character.toUpperCase(A.charAt(0)));
        B = B.replace(B.charAt(0), Character.toUpperCase(B.charAt(0)));
        System.out.println(A + " " + B);
    }
}
