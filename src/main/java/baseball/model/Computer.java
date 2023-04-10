package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private static final List<Integer> balls = new ArrayList<>();

    public static List<Integer> getBalls() {
        return balls;
    }

    public static void genBalls() {
        balls.clear();
        while (balls.size() != Setting.LENGTH) {
            // (0 ~ 8) +1  -> (1 ~ Setting.Length)
            int num = Setting.random.nextInt(Setting.MAX_NUMBER - 1) + 1;
            if (!balls.contains(num)) {
                balls.add(num);
            }
        }
    }
}
