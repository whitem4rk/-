package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.Score;
import baseball.view.GameView;
import utils.InputUtils;

import java.util.Scanner;

public class Game {

    public void start(Scanner scanner) {
        do {
            Score.resetScore();
            Computer.genBalls();

            play(scanner);
            GameView.printRestartOrExit();
        } while (!InputUtils.isExit(scanner.nextLine()));
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
        Score.countBall(Computer.getBalls(), Player.getBalls());
        Score.countStrike(Computer.getBalls(), Player.getBalls());
    }
}
