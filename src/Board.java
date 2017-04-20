/* Board 
 *
 * Layout:
 *     index: 
 *     | 1 | 2 | 3 | 
 *     -------------
 *     | 4 | 5 | 6 | 
 *     -------------
 *     | 7 | 8 | 9 |
 *     
 *     row, col:
 *     | 0,0 | 0,1 | 0,2 | 
 *     -------------
 *     | 1,0 | 1,1 | 1,2 | 
 *     -------------
 *     | 2,0 | 2,1 | 2,2 |
 */

public class Board {
	public static final int ROWS = 3;
	public static final int COLS = 3;

	private Cell[][] board = new Cell[ROWS][COLS];

	public Board() {
		for(int row = 0; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				board[row][col] = new Cell(row, col);
			}
		}
	}

	public void clear() {
		for(int row = 0; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				(board[row][col]).clear();
			}
		}
	}

	public void print() {
		for(int row = 0; row < ROWS; row++) {
			for(int col = 0; col < COLS; col++) {
				// display content
				//System.out.println((board[row][col]).getIndex());
				(board[row][col]).print();
                // display vertical divider
				if(col < COLS - 1) { System.out.print("|"); }

			}
			// go to next row
			System.out.println();
			// display horizontal divider 
			if(row < ROWS - 1) { System.out.println("-----------"); }
		}
	}
}

