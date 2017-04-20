public class Cell {
	private CellType content;
	private int row, col;

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear();
	}

	public void clear() {
		this.content = CellType.EMPTY;
	}

	public void print() {
		switch(this.content) {
			case EMPTY: 
				System.out.print("   "); 
				break;
			case HUMAN:
				System.out.print(" X ");
				break;
			case COMPUTER:
				System.out.print(" O ");
				break;
		}
	}

	public int getIndex() {
		return this.row * Board.COLS + this.col + 1;
	}

}