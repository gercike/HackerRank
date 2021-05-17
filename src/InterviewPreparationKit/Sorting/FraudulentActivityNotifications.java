package InterviewPreparationKit.Sorting;

import java.util.*;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(countingSort(Arrays.asList(50, 30, 40, 20, 10))));
        System.out.println(Arrays.toString(countingSort(Arrays.asList(0, 4, 3, 1, 2, 0, 1, 8))));
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        Queue<Integer> queue = new LinkedList<>();
        int[] idxArray = new int[201];
        // kell egy for ciklus a queue és a count array (vagy index-tömb) feltöltéséhez
        for (int i = 0; i < d; i++) {
            queue.add(expenditure.get(i));
            idxArray[expenditure.get(i)]++;
        }
        // végigmegyek egyszer a count arrayen, és beírom az összes szám helyét (az első értéke -1)
        idxArray[0] -= 1;
        for (int i = 1; i < idxArray.length; i++) {
            idxArray[i] += idxArray[i - 1];
        }
        int counter = 0;
        // innen egy for ciklus, aminek minden iterációjában
        //1. meghatározom a count array alapján a medián értékét
        //2. ha a medián értékének duplájánál nagyobb a köv. kiadás, akkor counter++
        //3. queue-ból dobok és hozzáadok, ezekkel frissítem a count arrayt
        for (int i = d; i < expenditure.size(); i++) {
            int nextExpend = expenditure.get(i);
            double median = 0;
            // 1. lépés
            if (d % 2 != 0) { // ha a középső elem a medián (páratlan darabszámú count array)
                int targetIdx = d / 2;
                for (int j = 0; j < idxArray.length; j++) {
                    if (idxArray[j] >= targetIdx) {
                        median = j;
                        break;
                    }
                }
            } else { // ha a két középső elem számtani közepe a medián (páros darabszámú count array)
                int lowerIdx = d / 2 - 1;
                int higherIdx = d / 2;
                int lowerValue = 0;
                int higherValue = 0;
                for (int j = 0; j < idxArray.length; j++) {
                    if (idxArray[j] == lowerIdx) {
                        lowerValue = j;
                        for (int k = j + 1; k < idxArray.length; k++) {
                            if (idxArray[k] >= higherIdx) {
                                higherValue = k;
                                break;
                            }
                        }
                        break;
                    }
                    if (idxArray[j] > lowerIdx) {
                        lowerValue = j;
                        higherValue = j;
                        break;
                    }
                }
                median = (lowerValue + higherValue) / (double) 2;
            }
            //2. lépés
            if (nextExpend >= median * 2) {
                counter++;
            }
            //3. lépés
            if (i < expenditure.size() - 1) {
                int numToDrop = queue.remove();
                queue.add(nextExpend);
                int smaller = Math.min(numToDrop, nextExpend);
                for (int j = smaller; j < idxArray.length; j++) {
                    if (j >= numToDrop) {
                        idxArray[j]--;
                    }
                    if (j >= nextExpend) {
                        idxArray[j]++;
                    }
                }
            }
        }

        return counter;
    }

    public static int activityNotifications_slow(List<Integer> expenditure, int d) {
        int counter = 0;
        for (int i = 0, j = d; j < expenditure.size(); i++, j++) {
            List<Integer> subList = expenditure.subList(i, j);
            Collections.sort(subList);
            double median;
            if (subList.size() % 2 == 0) {
                median = ((double) subList.get(subList.size() / 2 - 1) + subList.get(subList.size() / 2)) / 2;
            } else {
                median = subList.get(subList.size() / 2);
            }
            if (expenditure.get(j) >= median * 2) {
                counter++;
            }
        }
        return counter;
    }

    static int[] countingSort(List<Integer> unordered) {
        int[] idxArray = new int[201];
        for (Integer integer : unordered) {
            idxArray[integer]++;
        }
        idxArray[0] -= 1;
        for (int i = 1; i < idxArray.length; i++) {
            idxArray[i] += idxArray[i - 1];
        }
        int[] ordered = new int[unordered.size()];
        for (Integer integer : unordered) {
            ordered[idxArray[integer]] = integer;
            idxArray[integer]--;
        }
        return ordered;
    }

}
