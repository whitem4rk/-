package baseball.view;

import baseball.model.Computer;
import baseball.model.Score;
import baseball.model.Setting;

public class GameView {

    private static final String GAME_START = "숫자를 입력해주세요 : ";
    private static final String CORRECT = "" + Setting.LENGTH + "개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String RESTART_OR_EXIT = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printGameStart() {
        System.out.print(GAME_START);
    }

    public static void printCorrect() {
        System.out.println(CORRECT);
    }

    public static void printRestartOrExit() {
        System.out.println(RESTART_OR_EXIT);
    }

    public static void printGameResult() {
        if (Score.strike == 0 && Score.ball == 0) {
            System.out.println("낫싱");
        } else {
            if (Score.ball > 0) {
                System.out.println("" + Score.ball + "볼 ");
            }
            if (Score.strike > 0) {
                System.out.println("" + Score.strike + "스트라이크");
            }
        }
    }

}
