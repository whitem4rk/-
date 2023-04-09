package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Score;
import baseball.model.Setting;
import baseball.view.GameView;
import utils.InputUtils;

import java.util.List;
import java.util.Scanner;

public class Game {

    public void start(Scanner scanner) {
        while (true) {
            Score.resetScore();
            Computer.genBalls();

            play(scanner);
            GameView.printRestartOrExit();
            if (InputUtils.isExit(scanner.nextLine())) {
                break;
            }
        }
    }

    private static void play(Scanner scanner) {
        while (!Score.threeStrike()) {
            Score.resetScore();
            GameView.printGameStart();
            Player.setBalls(InputUtils.stringToArrayList(scanner.nextLine()));
            compareBalls();
            GameView.printGameResult();
        }
        GameView.printCorrect();
    }

    private static void compareBalls() {
        for (int i = 0; i < Setting.LENGTH; i++) {
            if (Computer.getBalls().get(i) == Player.getBalls().get(i)) {
                Score.strike += 1;
            } else if (Computer.getBalls().contains(Player.getBalls().get(i))) {
                Score.ball += 1;
            }
        }
    }
}
