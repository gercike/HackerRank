package JavaStaticInitializerBlock;

import java.util.Scanner;

public class Java_Static_Initializer_Block {
    static int B;
    static int H;
    static boolean flag;

    //    Write your code here
    static {
        Scanner s = new Scanner(System.in);
//        Scanner s = null;
//        try {
//            s = new Scanner(new File("src/HackerRank/JavaStaticInitializerBlock/numbers"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        B = s.nextInt();
        H = s.nextInt();
        flag = (B > 0 && H > 0);
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main
}
