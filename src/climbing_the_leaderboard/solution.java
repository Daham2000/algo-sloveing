package climbing_the_leaderboard;

import java.util.*;

public class solution {
    public static void main(String[] args) {
        List<Integer> ranked=new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);
        List<Integer> player=new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        List<Integer> integers = climbingLeaderboard(ranked, player);
        System.out.println(integers);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> rankList=new ArrayList<>();
        player.forEach(newMark -> {
            List<Integer> markList = new ArrayList<>(ranked);
            markList.add(newMark);
            Set<Integer> s = new LinkedHashSet<>(markList);
            markList.clear();
            markList.addAll(s);
            Collections.sort(markList, Collections.reverseOrder());
            rankList.add(markList.indexOf(newMark) + 1);
        });
        return rankList;
    }
}
