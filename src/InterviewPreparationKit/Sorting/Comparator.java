package InterviewPreparationKit.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            List<String> list = new ArrayList<>();
            list.add(a.name);
            list.add(b.name);
            Collections.sort(list);
            if (list.get(0).equals(a.name)) {
                return -1;
            } else if (list.get(0).equals(b.name)) {
                return 1;
            } else {
                return 0;
            }
        }
        return b.score - a.score;
    }
}
