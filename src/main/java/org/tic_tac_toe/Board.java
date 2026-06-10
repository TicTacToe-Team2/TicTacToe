package org.tic_tac_toe;

public class Board {

    private char[][] board;

    public Board () {
       board = new char[3][3];
        initializeBoard();
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                this.board[row][column ] = ' ';
            }
        }
    }

    // Method para pintar el tablero vacío
   public void printBoard() {
        System.out.println("    0   1   2");
        System.out.println("  ┌───┬───┬───┐");

        for (int row = 0; row < 3; row++) {
            System.out.print(row + " │");
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + board[row][col] + " │");
            }
            System.out.println();
            if (row < 2) {
                System.out.println("  ├───┼───┼───┤");
            }
        }
        System.out.println("  └───┴───┴───┘");
    }

    // Method para comprobar que una posición del tablero está vacío
    public boolean isPositionEmpty(int row, int column) {
        return board[row][column] != ' ';
    }

    // Method para colocar una ficha (X o O) en el tablero
    public void placeMark(int row, int column, char mark) {
        if (isPositionEmpty(row, column)) {
            board[row][column] = mark;
        } else {
            System.out.println("Please choose another position to place your mark.");
        }
    }

    // Method para pintar el tablero con la ficha colocada
    public void printMarks() {
        System.out.println("    0   1   2");
        System.out.println("  ┌───┬───┬───┐");

        for (int row = 0; row < 3; row++) {
            System.out.print(row + " │");
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + board[row][col] + " │");
            }
            System.out.println();
            if (row < 2) {
                System.out.println("  ├───┼───┼───┤");
            }
        }
        System.out.println("  └───┴───┴───┘");
    }

}
