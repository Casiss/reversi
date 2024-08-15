package com.example.reversi.model;

public class Move {
    private int row;
    private int col;

    public Move(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isValid(Board board, Player player) {
        // 移動が有効かどうかを判定するロジック
        return board.isCellEmpty(row, col);
    }

    public void execute(Board board, Player player) {
        board.setCell(row, col, player.getColor());
        // 石をひっくり返すロジックを追加
    }
}
