package JavaOutputFormatting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner sc=new Scanner(new File("src/HackerRank/JavaOutputFormatting/JavaOutputFormatting.txt"));
//            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.format("%-15s" + "%03d%n", s1, x);
            }
            System.out.println("================================");

        }
}
