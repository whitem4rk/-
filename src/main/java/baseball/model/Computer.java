package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private static List<Integer> balls = new ArrayList<>();

    static final Random random = new Random();
    static final int MAX_NUMBER = 9;
    static final int MIN_NUMBER = 1;
    static final int LENGTH = 3;


    public static List<Integer> getBalls() {
        return balls;
    }

    public static void setBalls() {
        balls.clear();
        while (balls.size() != LENGTH) {
            int num = random.nextInt(8) + 1;
            if (!balls.contains(num)) {
                balls.add(num);
            }
        }
    }
}
