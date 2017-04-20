public enum CellType {
	EMPTY, 
	X, 
	O
}

public class Cell {
	CellType content;
	int row, col;

	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
		clear();
	}

	public void clear() {
		content = CellType.EMPTY;
	}

	public void display() {
		switch(content) {
			case CellType.EMPTY: 
				System.out.print(" "); 
				break;
			case CellType.X:
				System.out.print("X");
				break;
			case CellType.O:
				System.out.print("O");
				break;
		}
	}

}