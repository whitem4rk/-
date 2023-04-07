package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static List<Integer> balls;

    static final int MAX_NUMBER = 9;
    static final int MIN_NUMBER = 1;
    static final int LENGTH = 3;

    public static void setBalls(ArrayList<Integer> balls) {
        Player.balls = balls;
    }

    public static List<Integer> getBalls() {
        return balls;
    }
}
