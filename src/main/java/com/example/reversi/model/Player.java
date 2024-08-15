package com.example.reversi.model;

public class Player {
    private char color;

    public Player(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    public void switchPlayer() {
        color = (color == 'B') ? 'W' : 'B';
    }
}
