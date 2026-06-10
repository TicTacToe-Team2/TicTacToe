
package org.tic_tac_toe;

import java.util.Scanner;

public class Game {

    private boolean winner = false;
    private int numOfMovements = 0;

    private Scanner scanner = new Scanner(System.in);

      public Player createPlayer(int numPlayer, char mark){
        System.out.println("Hello player " +  numPlayer + ", what's your name?: ");
        String name = scanner.nextLine();
        return new Player(name, mark);
      }

      /*
      Para terminar juego:
      - todas las casillas llenas
      - un jugador gana

      Para ganar:
      - 3 fichas iguales en horizontal, vertical, o diagonal
           --> cómo comprobamos:
                1. si hay una ficha colocada
                2. si hay 3 en raya
       */

    public void endGame(){

    }

          
     
}
