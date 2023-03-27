package com.dumanli.springframework;

import com.dumanli.springframework.game.GameRunner;
import com.dumanli.springframework.game.MarioGame;


public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
