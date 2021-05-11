package Algorithms;

import java.util.*;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranksOfPlayersScores = new ArrayList<>();
        int idxOfLeaderBoardScore = 0;
        int previousScoreOnBoard = Integer.MAX_VALUE;
        int rankOfPreviousScoreOnBoard = 0;
        for (int i = 0; i < ranked.size(); i++) {
            idxOfLeaderBoardScore = i;
            if (player.get(0) >= ranked.get(i)) {
                ranksOfPlayersScores.add(rankOfPreviousScoreOnBoard + 1);
                if (i == ranked.size() - 1) {
                    idxOfLeaderBoardScore++;
                    rankOfPreviousScoreOnBoard++;
                }
                break;
            }
            if (ranked.get(i) < previousScoreOnBoard) {
                rankOfPreviousScoreOnBoard++;
            }
            previousScoreOnBoard = ranked.get(i);
            if (i == ranked.size() - 1) {
                ranksOfPlayersScores.add(rankOfPreviousScoreOnBoard + 1);
                idxOfLeaderBoardScore++;
            }
        }
        idxOfLeaderBoardScore--;
        for (int iOfPlayer = 1; iOfPlayer < player.size(); iOfPlayer++) {
            for (; idxOfLeaderBoardScore >= 0; idxOfLeaderBoardScore--) {
                if (ranked.get(idxOfLeaderBoardScore) > previousScoreOnBoard) {
                    rankOfPreviousScoreOnBoard--;
                }
                previousScoreOnBoard = ranked.get(idxOfLeaderBoardScore);
                if (player.get(iOfPlayer) < ranked.get(idxOfLeaderBoardScore)) {
                    ranksOfPlayersScores.add(rankOfPreviousScoreOnBoard + 1);
                    break;
                }
                if (player.get(iOfPlayer).equals(ranked.get(idxOfLeaderBoardScore))) {
                    ranksOfPlayersScores.add(rankOfPreviousScoreOnBoard);
                    break;
                }
                if (idxOfLeaderBoardScore == 0) {
                    ranksOfPlayersScores.add(1);
                    idxOfLeaderBoardScore++;
                    break;
                }
            }
        }
        return ranksOfPlayersScores;
    }

    public static List<Integer> climbingLeaderboard_slow(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranks = new ArrayList<>();
        for (Integer playerScore : player) {
            int previousScore = Integer.MAX_VALUE;
            int rankOfScore = 1;
            for (Integer rankedScore : ranked) {
                if (playerScore >= rankedScore) {
                    break;
                }
                if (rankedScore < previousScore) {
                    rankOfScore++;
                    previousScore = rankedScore;
                }
            }
            ranks.add(rankOfScore);
        }
        return ranks;
    }

    public static List<Integer> climbingLeaderboard_stillABitSlow(List<Integer> ranked, List<Integer> player) {
        List<Integer> ranksOfPlayer = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int rank = 0;
        int first = ranked.get(0);
        for (Integer integer : ranked) {
            if (!hashMap.containsKey(integer)) {
                hashMap.put(integer, ++rank);
            }
        }
        for (Integer playerScore : player) {
            if (hashMap.containsKey(playerScore)) {
                ranksOfPlayer.add(hashMap.get(playerScore));
            } else {
                if (playerScore < first) {
                    while (!hashMap.containsKey(playerScore)) {
                        playerScore++;
                    }
                    ranksOfPlayer.add(hashMap.get(playerScore) + 1);
                } else {
                    ranksOfPlayer.add(1);
                }
            }
        }
        return ranksOfPlayer;
    }
}
