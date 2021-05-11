package Algorithms;

import java.util.Arrays;

public class FormingAMagicSquare {
    static int[][] TOP = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
    static int[][] RIGHT = new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
    static int[][] LEFT = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
    static int[][] BOTTOM = new int[][]{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(oneIsInMiddleTopPosition(new int[3][3], 0, 1, 1)));
    }

    static int formingMagicSquare(int[][] s) {
        int[][] reflectedS = getReflectionOfSquare(s);
        int one = getMinimumChangeNeeded(s);
        int two = getMinimumChangeNeeded(reflectedS);
        return Math.min(one, two);
    }

    static int getMinimumChangeNeeded(int[][] s) {
        int topDif = 0;
        int rightDif = 0;
        int leftDif = 0;
        int bottomDif = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j] != TOP[i][j]) {
                    topDif += Math.abs(s[i][j] - TOP[i][j]);
                }
                if (s[i][j] != RIGHT[i][j]) {
                    rightDif += Math.abs(s[i][j] - RIGHT[i][j]);
                }
                if (s[i][j] != LEFT[i][j]) {
                    leftDif += Math.abs(s[i][j] - LEFT[i][j]);
                }
                if (s[i][j] != BOTTOM[i][j]) {
                    bottomDif += Math.abs(s[i][j] - BOTTOM[i][j]);
                }
            }
        }
        int min1 = Math.min(topDif, rightDif);
        int min2 = Math.min(leftDif, bottomDif);
        return Math.min(min1, min2);
    }

    static int[][] getReflectionOfSquare(int[][] twoDArray) {
        int[][] reflection = new int[twoDArray.length][twoDArray.length];
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                int newI = i;
                if (i == 0) {
                    newI = 2;
                }
                if (i == 2) {
                    newI = 0;
                }
                reflection[newI][j] = twoDArray[i][j];
            }
        }
        return reflection;
    }

    //up+right | down
    static int[][] oneIsInMiddleTopPosition(int[][] twoDArray, int x, int y, int number) {
        int normalStepX = x - 1;
        if (normalStepX < 0) {
            normalStepX = twoDArray.length - 1;
        }
        int derailedx = x + 1;
        if (derailedx > twoDArray.length - 1) {
            derailedx = 0;
        }
        int normalStepY = y + 1;
        if (normalStepY > twoDArray[0].length - 1) {
            normalStepY = 0;
        }
        int derailedY = y;
        if (number == 1) {
            normalStepX = x;
            normalStepY = y;
        }
        if (number == Math.pow(twoDArray.length, 2)) {
            if (twoDArray[normalStepX][normalStepY] > 0) {
                twoDArray[derailedx][derailedY] = number;
            } else {
                twoDArray[normalStepX][normalStepY] = number;
            }
            return twoDArray;
        } else {
            if (twoDArray[normalStepX][normalStepY] > 0) {
                twoDArray[derailedx][derailedY] = number;
                return oneIsInMiddleTopPosition(twoDArray, derailedx, derailedY, ++number);
            } else {
                twoDArray[normalStepX][normalStepY] = number;
                return oneIsInMiddleTopPosition(twoDArray, normalStepX, normalStepY, ++number);
            }
        }
    }
}
