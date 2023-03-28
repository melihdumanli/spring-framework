package com.dumanli.springframework.game;

public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Pacman is going up");
    }

    @Override
    public void down() {
        System.out.println("Pacman is going down");
    }

    @Override
    public void left() {
        System.out.println("Pacman is going left");
    }

    @Override
    public void right() {
        System.out.println("Pacman is going right");
    }
}
