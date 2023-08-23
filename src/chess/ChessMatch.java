package chess;

import boradgame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int indexRow=0; indexRow<board.getRows(); indexRow++) {
			for (int indexCol=0; indexCol<board.getColumns(); indexCol++) {
				mat[indexRow][indexCol] = (ChessPiece) board.piece(indexRow, indexCol);
			}
		}
		
		return mat;
	}
}
