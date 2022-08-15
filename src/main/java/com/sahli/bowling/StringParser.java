package com.sahli.bowling;

import java.util.ArrayList;

public class StringParser {

    public ArrayList<Integer> parse(String rolls) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < rolls.length(); i++) {
            result.add(createRoll(rolls, i));
        }
        return result;
    }

    private Integer createRoll(String rolls, int i) {
        int score = scoreOf(i, rolls);
        return score;
    }

    private int scoreOf(int numberOfRoll, String rolls) {
        char score = rolls.charAt(numberOfRoll);
        if (score == '-') {
            return 0;
        }
        if (score == '/') {
            return 10 - scoreOf(numberOfRoll - 1, rolls);
        }
        if (score == 'X') {
            return 10;
        }
        return Character.getNumericValue(score);
    }
}
