package com.dumanli.springframework;

import com.dumanli.springframework.game.GameRunner;
import com.dumanli.springframework.game.PacManGame;
import com.dumanli.springframework.game.SuperContraGame;


public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        var game = new SuperContraGame();
        // GameRunner class is no longer coupled to a specific game.
        // But only coupled to the GamingConsole
        var game1 = new PacManGame(); // 1: Object Creation
        var gameRunner = new GameRunner(game);
        var gameRunner2 = new GameRunner(game1); // 2: Object Creation + Wiring of Dependencies
            // Game is dependency of GameRunner
        gameRunner.run();
        gameRunner2.run();
    }
}
