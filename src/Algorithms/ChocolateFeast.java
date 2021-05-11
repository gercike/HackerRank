package Algorithms;

public class ChocolateFeast {
    static int chocolateFeast(int money, int price, int nOfWrappersForANew) {
        int chocolatBars = money / price;
        int eatenBars = 0;
        int wrappers = 0;
        while (chocolatBars + wrappers>= nOfWrappersForANew) {
            eatenBars += chocolatBars;
            wrappers += chocolatBars;
            chocolatBars = 0;
            if (wrappers >= nOfWrappersForANew) {
                chocolatBars = wrappers / nOfWrappersForANew;
                wrappers = wrappers % nOfWrappersForANew;
            }
        }
        eatenBars += chocolatBars;
        return eatenBars;
    }
}
