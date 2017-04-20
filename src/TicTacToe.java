/* Tic-Tac-Toe
 * 
 * Spec / Requirements:
 * 1. Human player (Xs) vs Computer player (Os)
 * 2. Human player always starts
 * 3. Each Human player turn:
 *    	a. Program prompts human for cell to play
 *      b. Human player indicates cell to play by entering 1-9 
 *         (First row: 1-3, Second row: 4-6, Third row: 7-9)
 *      c. If the specified cell is not available, or invalid, 
 *         program should display relevant message and 
 *         prompt human for cell to play again
 *      d. If the specified cell is available, update and display 
 *         the new state of the board and move on to Computer player turn.
 * 4. Each Computer player turn:
 *      a. Computer plays automatically according to a pluggable algorithm.
 *             1. Implement a Computer Player that makes random but valid moves.
 *      b. Update and display the new state of the board and move on to Human player turn.
 * The program detects when a game finishes and announces winner or tie.
 * 
 */

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Board board = new Board();

		System.out.println("Let's play Tic-Tac-Toe!\n");

		System.out.println("Here is the layout of the board:");
		board.printIndex();


	}


}