package baseball;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static ArrayList<Integer> comGenNum() {
        Random random = new Random();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        // depth 1
        while (numList.size() != 3) {
            int randomNum = random.nextInt(9) + 1;
            // depth 2
            if (!numList.contains(randomNum))
                numList.add(randomNum);
        }
        return numList;
    }

    public static void main(String[] args) {
    }
}
