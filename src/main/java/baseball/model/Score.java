package baseball.model;

import java.util.ArrayList;

public class Score {

    public static int ball = 0;
    public static int strike = 0;

    public static void resetScore() {
        ball = 0;
        strike = 0;
    }

    public boolean threeStrike(int strike) {
        return strike == 3;
    }

    public void countBall(ArrayList<Integer> computerBalls, ArrayList<Integer> playerBalls) {
        for (int i = 0; i < Computer.LENGTH; i++) {
            if (computerBalls.contains(playerBalls.get(i)) && computerBalls.get(i) != playerBalls.get(i)) {
                ball += 1;
            }
        }
    }

    public void countStrike(ArrayList<Integer> computerBalls, ArrayList<Integer> playerBalls) {
        for (int i = 0; i < Computer.LENGTH; i++) {
            if (computerBalls.get(i) == playerBalls.get(i)) {
                strike += 1;
            }
        }
    }
}
