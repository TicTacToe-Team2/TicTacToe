
package org.tic_tac_toe;

import java.util.Scanner;

public class Game {
     private Scanner scanner = new Scanner(System.in); 

      public Player createPlayer(int numPlayer, char mark){
        System.out.println("Hello player " +  numPlayer + ", what's your name?: ");
        String name = scanner.nextLine();
        return new Player(name, mark);
      } 
          
     
}
