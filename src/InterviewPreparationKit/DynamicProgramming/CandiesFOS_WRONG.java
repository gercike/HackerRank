package InterviewPreparationKit.DynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandiesFOS_WRONG {
    public static void main(String[] args) throws FileNotFoundException {
//        ArrayList<Integer> list1 = new ArrayList<>(List.of(1, 2, 2));//4
//        ArrayList<Integer> list2 = new ArrayList<>(List.of(2, 4, 2, 6, 1, 7, 8, 9, 2, 1));//19
//        ArrayList<Integer> list3 = new ArrayList<>(List.of(2, 4, 3, 5, 2, 6, 4, 5));//12
//        ArrayList<Integer> list31 = new ArrayList<>(List.of(2, 4, 3, 5, 2, 2, 6, 4, 5));//13
//        ArrayList<Integer> list4 = new ArrayList<>(List.of(5, 21, 40, 30, 15, 14, 14, 14, 14, 18, 19, 19, 26, 26, 26, 26, 20, 15, 10, 10, 9, 8));//42
//        ArrayList<Integer> list5 = new ArrayList<>(List.of(5, 4, 3, 2, 1));//15
//        ArrayList<Integer> list6 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 3, 2, 1, 1, 1, 2, 3, 1));//29
//        ArrayList<Integer> list7 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 2, 3, 5, 4, 3, 2, 1, 3, 2, 1, 2, 3, 4, 2, 1, 1));//55
//        ArrayList<Integer> list8 = new ArrayList<>(List.of(3, 2, 1, 2, 3, 1, 2, 3, 2, 1));//20
        File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\CandiesCases\\candiesTestCase#11.txt");//33556
//        File file = new File("C:\\Users\\Gercike\\IdeaProjects\\HackerRank\\files\\CandiesCases\\candiesTestCase#2.txt");//42105
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> list14 = new ArrayList<>();
        while (scanner.hasNextLine()) {
            list14.add(scanner.nextInt());
        }
        System.out.println(list14.get(0));
        System.out.println(list14.get(list14.size() - 1));
        System.out.println(candies(0, list14));
    }

    public static long candies(int n, List<Integer> arr) {
        int uphillLength = 0;
        int downhillLength = 0;
        int hillCounter = 0;
        long reward = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1) { //a lista utolsó elemével fut csak le, és az if végén véget is ér a ciklus
                if (uphillLength == 0 && downhillLength == 0) {
                    reward++;
                }
                if (uphillLength > 0 && downhillLength == 0) {
                    uphillLength++;
                    if (hillCounter > 0) {
                        reward -= (hillCounter - 1);
                        reward += (getTriangularNumber(uphillLength) - 1);
                    }
                    if (hillCounter == 0) {
                        reward += (getTriangularNumber(uphillLength));
                    }
                }
                if (downhillLength > 0) {
                    if (uphillLength == 0) {
                        downhillLength++;
                        reward += getTriangularNumber(downhillLength);
                    }
                    if (uphillLength > 0) {
                        downhillLength++;
                        reward += getHillReward(uphillLength, downhillLength);
                        if (hillCounter > 0) {
                            reward = reward - (hillCounter - 1);
                        }
                    }
                }
                break;
            }
            if (arr.get(i) < arr.get(i + 1)) {
                if (downhillLength > 0) {//ha leértünk a völgy aljára, de rögtön következik egy hegy
                    downhillLength++;
                    reward += getHillReward(uphillLength, downhillLength);
                    downhillLength = 0;
                    uphillLength = 0;
                }
                uphillLength++;
            }
            if (arr.get(i) > arr.get(i + 1)) {
                downhillLength++;
                if (downhillLength == 1 && uphillLength > 0) {
                    hillCounter++;
                }
                if (i == 0) {
                    reward--;
                }
            }
            if (arr.get(i) == arr.get(i + 1)) {
                if (uphillLength == 0 && downhillLength == 0) {
                    reward++;
                }
                if (uphillLength > 0 && downhillLength == 0) {
                    uphillLength++;
                    if (hillCounter == 0) {
                        reward += (getTriangularNumber(uphillLength));
                    }
                    if (hillCounter > 0) {
                        reward -= (hillCounter - 1);
                        reward += (getTriangularNumber(uphillLength) - 1);
                        hillCounter = 0;
                    }
                    uphillLength = 0;
                }
                if (downhillLength > 0) {
                    downhillLength++;
                    if (uphillLength == 0) {
                        reward += getTriangularNumber(downhillLength);
                    }
                    if (uphillLength > 0) {
                        reward += getHillReward(uphillLength, downhillLength);
                        if (hillCounter > 0) {
                            reward -= (hillCounter - 1);
                        }
                        uphillLength = 0;
                    }
                    hillCounter = 0;
                    downhillLength = 0;
                }
            }
        }
        return reward;
    }

    static long getHillReward(int upHillLength, int downHillLength) {
        long reward = 0;
        if (upHillLength >= downHillLength) {
            upHillLength++;
            downHillLength--;
        }
        if (upHillLength != downHillLength) {
            reward += getTriangularNumber(Math.max(downHillLength, upHillLength));
            reward += getTriangularNumber(Math.min(downHillLength, upHillLength));
        }
        return reward;
    }

    static long getTriangularNumber(int number) {
        long n = 0;
        for (int i = 1; i <= number; i++) {
            n += i;
        }
        return n;
    }
}
