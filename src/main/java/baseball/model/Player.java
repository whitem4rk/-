package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private static List<Integer> balls;

    public static void setBalls(ArrayList<Integer> balls) {
        Player.balls = balls;
    }

    public static List<Integer> getBalls() {
        return balls;
    }
}
