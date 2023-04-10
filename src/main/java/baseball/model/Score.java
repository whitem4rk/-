package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Score {

    public static int ball = 0;
    public static int strike = 0;

    public static void resetScore() {
        ball = 0;
        strike = 0;
    }

    public static boolean threeStrike() {
        return strike == 3;
    }

    public static void countBall(List<Integer> computerBalls, List<Integer> playerBalls) {
        for (int i = 0; i < Setting.LENGTH; i++) {
            if (computerBalls.contains(playerBalls.get(i)) && !computerBalls.get(i).equals(playerBalls.get(i))) {
                ball += 1;
            }
        }
    }

    public static void countStrike(List<Integer> computerBalls, List<Integer> playerBalls) {
        for (int i = 0; i < Setting.LENGTH; i++) {
            if (computerBalls.get(i).equals(playerBalls.get(i))) {
                strike += 1;
            }
        }
    }
}
