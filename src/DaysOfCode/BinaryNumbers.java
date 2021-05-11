package DaysOfCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumbers {
    public static void main(String[] args) {
        System.out.println(convertDecimalIntToBinary(10025));
    }

    public static List<Integer> convertDecimalIntToBinary(int decimal) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (decimal / 2 > 0) {
            arrayList.add(0, decimal % 2);
            decimal = decimal / 2;
        }
        arrayList.add(0, decimal % 2);
        int longest = 0;
        int counter = 0;
        for (Integer integer : arrayList) {
            if (integer == 1) {
                counter++;
                if (counter > longest) {
                    longest = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(longest);
        return arrayList;
    }
}
