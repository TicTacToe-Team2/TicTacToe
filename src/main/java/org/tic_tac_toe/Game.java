
package org.tic_tac_toe;

import java.util.Scanner;

public class Game {

  private Scanner scanner = new Scanner(System.in);

  public Player createPlayer(int numPlayer, char mark) {
    System.out.print("Hello player " + numPlayer + ", what's your name?: ");
    String name = scanner.nextLine();
    return new Player(name, mark);
  }

  public void startGame() {
    Board board = new Board();
    board.printBoard();

    Player player1 = createPlayer(1, 'X');
    Player player2 = createPlayer(2, 'O');

    Player currentPlayer = player1;

    while (!board.isBoardFull()) {
      String mark = currentPlayer.getMark() == 'X' ? "❌" : "⭕️";

      int row = askPosition("\n" + mark + " " + currentPlayer.getName() +", it's your turn. Please add a row: ");
      int column = askPosition("\n" + mark + " " + currentPlayer.getName() + ",  please add a column: ");

      if (board.isPositionEmpty(row, column)) {
        board.getBoard()[row][column] = currentPlayer.getMark();
        board.printBoard();

        if (board.checkWinner(currentPlayer.getMark())) {
          System.out.println("\n 🎉 Congratulations! " + currentPlayer.getName() + " wins! 🎉");
          break;
        }

        // Aquí se debería comprobar si el jugador actual ha ganado
        // Si ha ganado, se establece winner a true y se sale del bucle
        // Si no ha ganado, se cambia al siguiente jugador
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
      } else {
        System.out.println("This position is already occupied. Please choose another one.");
      }
      //scanner.close();
    }

  }
  private int askPosition(String message) {
    int value;

    while (true) {
      System.out.println(message);

      if (scanner.hasNextInt()) {
        value = scanner.nextInt();
        scanner.nextLine();

        if (value >= 0 && value <= 2) {
          return value;
        }
        System.out.println("Invalid input. Please enter a number between 0 and 2.");
      }
      else{
          System.out.println("Invalid input. Please enter a number.");
          scanner.next();
        }
    }
  }
  }


