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

    public static void validCheck(String num) throws IllegalArgumentException{


        throw new IllegalArgumentException();
    }

    public static int manGenNum() throws IllegalArgumentException {
        Console console = System.console();
        String num = console.readLine("숫자를 입력해주세요 : ");
        try {
            validCheck(num);
        } catch (IllegalArgumentException e) {
            throw e;
        }

        return Integer.parseInt(num);
    }



    public static void main(String[] args) {
    }
}
