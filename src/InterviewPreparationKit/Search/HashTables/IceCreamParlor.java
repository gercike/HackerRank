package InterviewPreparationKit.Search.HashTables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 4, 5, 3, 2));
        int money = 4;
        List<Integer> lista2 = new ArrayList<>(List.of(2, 2, 4, 3));
        int money2 = 4;
        whatFlavors(lista, money);
        whatFlavors(lista2, money2);
    }

    public static void whatFlavors(List<Integer> cost, int money) {
        HashMap<Integer, List<Integer>> costsAndIndices = new HashMap<>();
        int index = 1;
        for (Integer integer : cost) {
            if (!costsAndIndices.containsKey(integer)) {
                ArrayList<Integer> array = new ArrayList<>();
                array.add(index++);
                costsAndIndices.put(integer, array);
            } else {
                costsAndIndices.get(integer).add(index++);
            }
        }
        for (Integer integer : costsAndIndices.keySet()) {
            if (costsAndIndices.containsKey(money - integer)) {
                if (money - integer == money / 2) {
                    System.out.println(costsAndIndices.get(integer).get(0) + " " + costsAndIndices.get(integer).get(1));
                } else if (costsAndIndices.get(integer).get(0) < costsAndIndices.get(money - integer).get(0)) {
                    System.out.println(costsAndIndices.get(integer).get(0) + " " + costsAndIndices.get(money - integer).get(0));
                } else {
                    System.out.println(costsAndIndices.get(money - integer).get(0) + " " + costsAndIndices.get(integer).get(0));
                }
                break;
            }
        }
    }
}
