package org.tic_tac_toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(Welcome());
        Board board = new Board();
        board.printBoard();


        Scanner scanner=new Scanner(System.in);

        System.out.println("Add a row");
        int row = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add a column");
        int column = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add your mark (X / O)");
        char mark = scanner.next().charAt(0);

        board.placeMark(row, column, mark);
        board.printMarks();

    }

    private static String Welcome(){
        return "Welcome to Tic-Tac-Toe!\r\n" + 
                        "\r\n" + 
                        "Get ready for an epic battle of X vs O.\r\n" + 
                        "\r\n" + 
                        "Rules:\r\n" + 
                        "\tPlayer X goes first.\r\n" + 
                        "\tChoose a row and a column to place your mark.\r\n" + 
                        "\tGet 3 marks in a row, column, or diagonal to win.\r\n" + 
                        "\tIf the board fills up and nobody wins, it's a draw.\r\n" + 
                        "\r\n" +
                        "Good luck, and may the best player win!" +
                        "\r\n\n";

    }

}
