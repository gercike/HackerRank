import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
        String s = "He is a very very good boy, isn't he?";
        String[] sentence = s.trim().split("[ !,?._'@]+");
        System.out.println(sentence.length);
        for (String s1 : sentence) {
            System.out.println(s1);
        }
        scan.close();
    }
}
