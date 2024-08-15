package com.example.reversi.model;

public class ReversiGame {
    private Board board;
    private Player currentPlayer;

    public ReversiGame() {
        board = new Board();
        currentPlayer = new Player('B'); // 黒が最初のプレイヤー
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean makeMove(int row, int col) {
        Move move = new Move(row, col);
        if (move.isValid(board, currentPlayer)) {
            move.execute(board, currentPlayer);
            currentPlayer.switchPlayer();
            return true;
        }
        return false;
    }

    public boolean hasValidMove() {
        // 現在のプレイヤーが有効な移動を持っているかどうかをチェック
        return true;
    }
}

