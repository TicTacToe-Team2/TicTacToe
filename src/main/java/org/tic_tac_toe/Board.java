package org.tic_tac_toe;

public class Board {

    private char[][] board;

    public Board(char[][] board) {
        board = new char[3][3];
        this.board = board;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}
