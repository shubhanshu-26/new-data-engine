
import java.util.*;

// Rock/Paper/Scissor Game

// IMPORTANT 
/*Instructions to play the game*/
/*Please put input as "r" or "p" or "s" in the  Custom Input tab and hit RUN*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String[] game = {"r", "p", "s"};
            String computerMove = game[new Random().nextInt(game.length)];
            
            String playerMove = "";
            
            while(true) {
                System.out.println("Please enter your move (r, p, or s)");
                if (scanner.hasNextLine()) {
                    playerMove = scanner.nextLine().trim();
                    if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                        break;
                    }
                    System.out.println(playerMove + " is not a valid move.");
                } else {
                    System.out.println("No input available.");
                    break;
                }
            }
            
            System.out.println("Computer played: " + computerMove);
            
            if (playerMove != null && !playerMove.isEmpty()) {
                if (playerMove.equals(computerMove)) {
                    System.out.println("The game was a tie!");
                } else if (playerMove.equals("r")) {
                    if (computerMove.equals("p")) {
                        System.out.println("You lose!");
                    } else if (computerMove.equals("s")) {
                        System.out.println("You win!");
                    }
                } else if (playerMove.equals("p")) {
                    if (computerMove.equals("r")) {
                        System.out.println("You win!");
                    } else if (computerMove.equals("s")) {
                        System.out.println("You lose!");
                    }
                } else if (playerMove.equals("s")) {
                    if (computerMove.equals("p")) {
                        System.out.println("You win!");
                    } else if (computerMove.equals("r")) {
                        System.out.println("You lose!");
                    }
                }
            } else {
                System.out.println("No valid move entered.");
            }
            System.out.println("Please play again");
                break;
        }
        
        scanner.close();
    }
}

