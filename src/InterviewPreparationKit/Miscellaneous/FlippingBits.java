package InterviewPreparationKit.Miscellaneous;

public class FlippingBits {
    public static void main(String[] args) {
        long number = 802743475;
        System.out.println(flippingBits(number));
    }

    public static long flippingBits(long n) {
        return binaryIntoLong(flipTheBitsOfBinary(integerInto32DigitBinary(n)));
    }

    static String integerInto32DigitBinary(long number) {
        String binary = Long.toBinaryString(number);
        int zerosNeeded = 32 - binary.length();
        while (zerosNeeded > 0) {
            binary = "0".concat(binary);
            zerosNeeded--;
        }
        return binary;
    }

    static String flipTheBitsOfBinary(String binary) {
        String flippedBinary = "";
        for (int i = 0; i < binary.length(); i++) {
            if (String.valueOf(binary.charAt(i)).equals("0")) {
                flippedBinary = flippedBinary.concat("1");
            } else {
                flippedBinary = flippedBinary.concat("0");
            }
        }
        return flippedBinary;
    }

    static long binaryIntoLong(String binary) {
        long result = 0;
        for (int i = 0, j = 31; i < binary.length(); i++, j--) {
            if (Character.getNumericValue(binary.charAt(i)) != 0) {
                result += Math.pow(2, j);
            }
        }
        return result;
    }
}
