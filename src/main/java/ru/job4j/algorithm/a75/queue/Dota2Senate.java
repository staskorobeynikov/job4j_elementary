package ru.job4j.algorithm.a75.queue;

import java.util.Deque;
import java.util.LinkedList;

public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Deque<Integer> radiants = new LinkedList<>();
        Deque<Integer> dires = new LinkedList<>();
        int countSenate = senate.length();
        char[] charArray = senate.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'R') {
                radiants.offer(i);
            } else {
                dires.offer(i);
            }
        }
        while (!radiants.isEmpty() && !dires.isEmpty()) {
            int rIndex = radiants.peek();
            int dIndex = dires.peek();
            if (rIndex < dIndex) {
                radiants.offer(rIndex + countSenate);
            } else {
                dires.offer(dIndex + countSenate);
            }
            radiants.poll();
            dires.poll();
        }
        return radiants.isEmpty() ? "Dire" : "Radiant";
    }
}
