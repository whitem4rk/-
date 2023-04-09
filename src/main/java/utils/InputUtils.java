package utils;

import baseball.model.Setting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InputUtils {

    public static boolean isExit(String option) {
        checkRestartOrExit(option);
        if (option.equals(Setting.CONTINUE)) {
            return false;
        }
        return true;
    }

    private static void checkRestartOrExit(String option) {
        if (option.equals(Setting.CONTINUE) && option.equals(Setting.END)) {
            throw new IllegalArgumentException();
        }
    }

    public static ArrayList<Integer> stringToArrayList(String stringBalls) {
        ballsValidationCheck(stringBalls);
        String[] ballsArr = stringBalls.split("");
        ArrayList<Integer> integerBalls = new ArrayList<>();
        for (String s : ballsArr) {
            integerBalls.add(Integer.parseInt(s));
        }

        return integerBalls;
    }

    private static void ballsValidationCheck(String stringBalls) {
        checkLength(stringBalls);
        checkNumber(stringBalls);
        checkZero(stringBalls);
        checkDuplicate(stringBalls);
    }

    private static void checkNumber(String stringBalls) {
        for (int i = 0; i < stringBalls.length(); i++) {
            if (!Character.isDigit(stringBalls.charAt(i))) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static void checkZero(String stringBalls) {
        if (stringBalls.contains("0")) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkLength(String stringBalls) {
        if (stringBalls.length() != Setting.LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private static void checkDuplicate(String stringBalls) {
        String[] strArrBalls = stringBalls.split("");
        ArrayList<String> ArrListBalls = new ArrayList<>(Arrays.asList(strArrBalls));
        Set<String> setBalls = new HashSet<>(ArrListBalls);
        if (ArrListBalls.size() != setBalls.size()) {
            throw new IllegalArgumentException();
        }
    }
}
