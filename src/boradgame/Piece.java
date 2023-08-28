package boradgame;

public abstract class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {		
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}	
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] possible = possibleMoves();
		for (int indexRow = 0; indexRow < possible.length; indexRow++) {
			for (int indexColumn = 0; indexColumn < possible.length; indexColumn++) {
				if (possible[indexRow][indexColumn]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
