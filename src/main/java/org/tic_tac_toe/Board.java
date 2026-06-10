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
                this.board[row][column] = ' ';
            }
        }
    }

    // Method para pintar el tablero vacío
   public void printBoard() {
        System.out.println("    0   1   2");
        System.out.println("  ┌───┬───┬───┐");

        for (int row = 0; row < 3; row++) {
            System.out.print(row + " │");
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + board[row][column] + " │");
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
        return board[row][column] == ' ';
    }

    // Method para comprobar si el tablero esta lleno

    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++){
                if (board[row][column]== ' ') {
                    return false;
                }
            }
        }
        return true;
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
            for (int column = 0; column < 3; column++) {
                System.out.print(" " + board[row][column] + " │");
            }
            System.out.println();
            if (row < 2) {
                System.out.println("  ├───┼───┼───┤");
            }
        }
        System.out.println("  └───┴───┴───┘");
    }

    // Method to check rows
    private boolean checkRows(char mark){
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == mark && board[row][1] == mark && board[row][2] == mark) {
                return true;
            }
        }
        return false;
    }

    // Method to check columns
    private boolean checkColumns(char mark){
        for (int column = 0; column < 3; column++) {
            if (board[0][column] == mark && board[1][column] == mark && board[2][column] == mark) {
                return true;
            }
        }
        return false;
    }

    // Method to check diagonal
    private boolean checkDiagonals(char mark) {
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return true;
        }

        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return true;
        }
        return false;
    }

    public boolean checkWinner(char mark) {
        return checkRows(mark) || checkColumns(mark) || checkDiagonals(mark);
    }
}
