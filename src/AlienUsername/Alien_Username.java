package AlienUsername;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Alien_Username {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/HackerRank/AlienUsername/names.txt"));
//        Scanner s = new Scanner(System.in);
        int iter = s.nextInt();
        for (int i = 0; i < iter; i++) {
            if (s.next().matches("^[_|\\.]\\d+[a-zA-Z]*_?$")){
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }

    }
}
