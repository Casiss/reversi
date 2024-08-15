package com.example.reversi.model;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = '-';
            }
        }
        board[3][3] = 'W';
        board[3][4] = 'B';
        board[4][3] = 'B';
        board[4][4] = 'W';
    }

    public char[][] getBoardState() {
        return board;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public void setCell(int row, int col, char player) {
        board[row][col] = player;
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == '-';
    }

    // 石をひっくり返すロジックや、他のボード関連の操作をここに追加できます。
}

