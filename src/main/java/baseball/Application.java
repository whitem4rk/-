package baseball;

import baseball.controller.Game;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Game game = new Game();
        game.start(new Scanner(System.in));
    }
}
