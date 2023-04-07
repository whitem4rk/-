package baseball;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

public class Application {

    public static ArrayList<Integer> comGenNum() {
        Random random = new Random();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while (numList.size() != 3) {
            int randomNum = random.nextInt(9) + 1;
            if (!numList.contains(randomNum))
                numList.add(randomNum);
        }
        return numList;
    }

    public static void validCheck(String num) throws IllegalArgumentException{
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i)) || num.charAt(i) == '0')
                throw new IllegalArgumentException();
        }
    }

    public static ArrayList<Integer> manGenNum() throws IllegalArgumentException {
        Console console = System.console();
        String num = console.readLine("숫자를 입력해주세요 : ");
        try {
            validCheck(num);
        } catch (IllegalArgumentException e) {
            throw e;
        }

        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++)
            arrNum.add(new Integer(num.charAt(i)));

        return arrNum;
    }

    public static int judge(ArrayList<Integer> comNum, ArrayList<Integer> manNum) {
        int ball = 0;
        int strike = 0;
        for (int i = 0; i < manNum.size(); i++) {
            if (comNum.contains(manNum.get(i))) {
                if (comNum.get(i) == manNum.get(i)) {
                    strike += 1;
                } else {
                    ball += 1;
                }
            }
        }

        if (ball != 0)
            System.out.print("" + ball + "볼 ");
        if (strike != 0)
            System.out.print("" + strike + "스트라이크 ");
        if (ball == 0 && strike == 0)
            System.out.print("낫싱");
        System.out.println();

        return strike;
    }

    public static boolean exit() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        Console console = System.console();
        int option = Integer.parseInt(console.readLine());

        if (option == 2) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
    }
}
