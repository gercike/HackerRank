import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String n = scanner.nextLine();
        BigInteger bigInteger = new BigInteger("139");
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");
        System.out.println(bigInteger.isProbablePrime(1));
        scanner.close();
    }
}
