package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class LargestPermutation {
    public static void main(String[] args) {
        String[] array =
                new String[]{"67", "87", "28", "106", "226", "95", "259", "224", "189", "171", "125", "99", "257", "203", "57", "45", "252", "239", "198", "46", "79", "158", "235",
                        "3", "225", "80", "78", "258", "172", "217", "121", "135", "250", "105", "24", "164", "92", "115", "29", "247", "248", "220", "169", "84", "261", "180",
                        "71", "86", "39", "82", "16", "232", "140", "19", "194", "230", "190", "25", "90", "100", "120", "75", "213", "8", "262", "216", "227", "20", "156", "40",
                        "36", "138", "94", "7", "117", "131", "48", "47", "208", "185", "207", "101", "234", "65", "53", "141", "133", "34", "233", "244", "170", "1", "118", "202",
                        "204", "246", "201", "188", "31", "62", "33", "11", "147", "111", "139", "210", "110", "253", "167", "215", "236", "196", "2", "74", "21", "150", "255",
                        "88", "256", "83", "240", "35", "114", "30", "14", "37", "168", "97", "73", "231", "63", "51", "200", "127", "237", "241", "143", "129", "58", "163", "112",
                        "132", "186", "254", "242", "218", "173", "59", "266", "267", "61", "18", "54", "68", "157", "263", "4", "268", "9", "10", "50", "177", "260", "109", "151",
                        "102", "146", "178", "98", "32", "191", "229", "166", "126", "13", "165", "228", "238", "103", "41", "183", "107", "179", "66", "184", "38", "144", "211",
                        "12", "181", "77", "212", "52", "5", "245", "206", "264", "159", "148", "223", "161", "55", "76", "149", "123", "122", "269", "104", "72", "93", "42",
                        "221", "251", "17", "154", "162", "209", "81", "89", "70", "197", "153", "199", "193", "249", "49", "270", "214", "119", "108", "136", "222", "128", "182",
                        "64", "205", "142", "23", "44", "192", "243", "124", "56", "22", "176", "130", "116", "155", "113", "160", "43", "6", "265", "219", "175", "15", "69",
                        "137", "60", "152", "26", "145", "91", "134", "96", "174", "85", "187", "195", "27"};
        String[] array2 = new String[]{"9", "10", "11", "12", "13", "14", "15", "2", "3", "4", "5", "6", "7", "8", "1"};
        Arrays.sort(array2);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));
    }

    static int[] largestPermutation(int k, int[] arr) {
        int[] idxOfValuesInArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            idxOfValuesInArr[arr[i]] = i;
        }
        for (int i = 0, j = idxOfValuesInArr.length - 1; i < k && i < arr.length; i++) {
            if (arr[i] == j) {
                j--;
                k++;
                continue;
            }
            idxOfValuesInArr[arr[i]] = idxOfValuesInArr[j];
            arr[idxOfValuesInArr[j]] = arr[i];
            arr[i] = j;
            j--;
        }
        return arr;
    }

    /**
     * This method sorts an array of integers into another array that is the largest possible permutation of those integers in lexicographical order in k steps. The HackerRank
     * exercise doesn't mention lexicographical order but lexicographical value of an array of integers which is confusing imo. Anyway this is a somewhat useful method so i'm
     * keeping it.
     */
    static int[] largestPermutation2(int k, int[] arr) {
        String[] stringArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            stringArray[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(stringArray);
        for (int i = 0, stringArrayIdx = stringArray.length - 1; i < k && i < arr.length; i++) {
            int max = Integer.parseInt(stringArray[stringArrayIdx]);
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == max) {
                    if (arr[j] == arr[i]) {
                        stringArrayIdx--;
                        k++;
                        break;
                    }
                    int temp = arr[i];
                    arr[i] = max;
                    arr[j] = temp;
                    stringArrayIdx--;
                    break;
                }
            }
        }
        return arr;
    }
}
