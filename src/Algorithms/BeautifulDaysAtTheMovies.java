package Algorithms;

public class BeautifulDaysAtTheMovies {

    //i-j, divider: k
    static int beautifulDays(int i, int j, int k) {
        int counter = 0;
        while (i <= j) {
            if ((i - reverseIntegerDigits(i, "")) % k == 0) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    static int reverseIntegerDigits(int number, String n) {
        if (Integer.toString(number).length() > 1) {
            int lastDigit = number % 10;
            String digit = Integer.toString(lastDigit);
            n += digit;
            int numbersToTheLeftFromLastDigit = number / 10;
            if (numbersToTheLeftFromLastDigit < 10) {
                return Integer.parseInt(n + numbersToTheLeftFromLastDigit);
            } else {
                return reverseIntegerDigits(numbersToTheLeftFromLastDigit, n);
            }
        } else {
            return number;
        }
    }
}
