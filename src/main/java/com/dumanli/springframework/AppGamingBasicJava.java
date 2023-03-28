package com.dumanli.springframework;

import com.dumanli.springframework.game.GameRunner;
import com.dumanli.springframework.game.MarioGame;
import com.dumanli.springframework.game.PacManGame;
import com.dumanli.springframework.game.SuperContraGame;


public class AppGamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        var game = new SuperContraGame();
        // GameRunner class is no longer coupled to a specific game.
        // But only coupled to the GamingConsole
        var game1 = new PacManGame();
        var gameRunner = new GameRunner(game);
        var gameRunner2 = new GameRunner(game1);
        gameRunner.run();
        gameRunner2.run();
    }
}
