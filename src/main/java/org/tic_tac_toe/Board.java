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

    /**
     * Initializes the board by filling all positions with a blank space (' ').
     * This method is called internally by the constructor.
     */
    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                this.board[row][column] = ' ';
            }
        }
    }

    /**
     * Prints the current state of the board in a formatted grid.
     * Empty positions appear as blank spaces.
     */
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

    /**
     * Checks whether a specific position on the board is empty.
     * @param row the row index (0–2)
     * @param column the column index (0–2)
     * @return true if the position contains a blank space (' '), false otherwise
     */
    public boolean isPositionEmpty(int row, int column) {
        return board[row][column] == ' ';
    }

    /**
     * Checks whether the board is completely full.
     * A full board means no position contains a blank space (' ').
     * @return true if all positions are filled, false otherwise
     */
    public boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++){
                if (board[row][column]== ' ') {
                    return false;
                }
            }
        }
        System.out.println("It's a draw! Play again 🤝 ");
        return true;
    }

    /**
     * Places a mark ('X' or 'O') on the board at the given position,
     * only if the position is empty. If the position is occupied,
     * an informational message is printed.
     *
     * @param row the row index (0–2)
     * @param column the column index (0–2)
     * @param mark the character representing the player's mark ('X' or 'O')
     */
    public void placeMark(int row, int column, char mark) {
        if (isPositionEmpty(row, column)) {
            board[row][column] = mark;
        } else {
            System.out.println("Please choose another position to place your mark.");
        }
    }

    /**
     * Checks whether the specified mark ('X' or 'O') has completed
     * any of the three horizontal rows.
     *
     * @param mark the player's mark to check
     * @return true if any row contains three identical marks, false otherwise
     */
    public boolean checkRows(char mark){
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == mark && board[row][1] == mark && board[row][2] == mark) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the specified mark ('X' or 'O') has completed
     * any of the three vertical columns.
     *
     * @param mark the player's mark to check
     * @return true if any column contains three identical marks, false otherwise
     */
    public boolean checkColumns(char mark){
        for (int column = 0; column < 3; column++) {
            if (board[0][column] == mark && board[1][column] == mark && board[2][column] == mark) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether the specified mark ('X' or 'O') has completed
     * either of the two diagonals.
     *
     * @param mark the player's mark to check
     * @return true if any diagonal contains three identical marks, false otherwise
     */
    public boolean checkDiagonals(char mark) {
        if (board[0][0] == mark && board[1][1] == mark && board[2][2] == mark) {
            return true;
        }
        if (board[0][2] == mark && board[1][1] == mark && board[2][0] == mark) {
            return true;
        }
        return false;
    }

    /**
     * Determines whether the specified mark ('X' or 'O') has won the game.
     * A win occurs if the mark completes a row, column, or diagonal.
     *
     * @param mark the player's mark to evaluate
     * @return true if the player has a winning combination, false otherwise
     */
    public boolean checkWinner(char mark) {
        return checkRows(mark) || checkColumns(mark) || checkDiagonals(mark);
    }
}
