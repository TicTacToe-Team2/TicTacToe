
package org.tic_tac_toe;

import java.util.Scanner;

public class Game {
     private Scanner scanner = new Scanner(System.in); 
      public Player createPlayer(char mark){
        System.out.println("Hello player, what's your name?: ");
        String name = scanner.nextLine();
        return new Player(name, mark);
      } 
          
     
}
