package baseball;

import baseball.controller.Game;
import baseball.model.Setting;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Game game = new Game();
        game.start(new Scanner(System.in));
    }
}
