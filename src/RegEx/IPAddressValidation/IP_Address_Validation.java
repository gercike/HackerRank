package RegEx.IPAddressValidation;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class IP_Address_Validation {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner s = new Scanner(new File("src/HackerRank/RegEx/IPAddressValidation/ip.txt"));
        Scanner s = new Scanner(System.in);
        int iter = s.nextInt();
        s.nextLine();
        for (int i = 0; i < iter; i++) {
            String str = s.nextLine();
            if (str.matches("^((([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))\\.){3}(([0-1]?[0-9]?[0-9])|([2]?[0-4]?[0-9])|([2]?[5]?[0-5]))$")){
                System.out.println("IPv4");
            } else if (str.matches("^(?:[0-9a-f]{1,4}:){7}[0-9a-f]{1,4}$")){
                System.out.println("IPv6");
            } else{
                System.out.println("Neither");
            }
        }
    }
}
