package org.tic_tac_toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print(Welcome());
        Board board = new Board();
        board.printBoard();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello player 1, what's your name?");
        String name1 = scanner.nextLine();

        System.out.println("Hello player 2, what's your name?");
        String name2 = scanner.nextLine();

        Player player1 = new Player(name1, 'X');
        Player player2 = new Player(name2, 'O');

        System.out.println(player1.getName());
        System.out.println(player1.getMark());
        System.out.println(player2.getName());
        System.out.println(player2.getMark());
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
