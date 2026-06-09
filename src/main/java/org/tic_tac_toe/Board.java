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
   public void printBoard() {

    // Encabezado de columnas
   System.out.println();
    System.out.println("    0   1   2");

    // Línea superior
    System.out.println("  ┌───┬───┬───┐");

    for (int row = 0; row < 3; row++) {

        // Número de fila + contenido
        System.out.print(row + " │");
        for (int col = 0; col < 3; col++) {
            System.out.print(" " + board[row][col] + " │");
        }
        System.out.println();

        // Separadores entre filas
        if (row < 2) {
            System.out.println("  ├───┼───┼───┤");
        }
    }

    // Línea inferior
    System.out.println("  └───┴───┴───┘");
}
}
