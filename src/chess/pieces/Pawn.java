package chess.pieces;

import boradgame.Board;
import boradgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	public Pawn(Board board, Color color) {
		super(board, color);
		
	}
	
	@Override
	public String toString() {
		return "P";
	}
	
//	private boolean canMove(Position position) {
//		ChessPiece piece = (ChessPiece)getBoard().piece(position);
//		return piece == null || piece.getColor() != getColor();
//	} 

		
	@Override
	public boolean[][] possibleMoves() {
		boolean [][] possible = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position auxPosition = new Position(0, 0);
		
		if (getColor() == Color.WHITE) {
			auxPosition.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() - 2, position.getColumn());
			Position auxPosition2 = new Position(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition) && getBoard().positionExists(auxPosition2) && !getBoard().thereIsAPiece(auxPosition2) && getMoveCount() == 0) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
		}		
		else {
			auxPosition.setValues(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() + 2, position.getColumn());
			Position auxPosition2 = new Position(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(auxPosition) && !getBoard().thereIsAPiece(auxPosition) && getBoard().positionExists(auxPosition2) && !getBoard().thereIsAPiece(auxPosition2) && getMoveCount() == 0) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
			
			auxPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(auxPosition) && isThereOpponentPiece(auxPosition)) {
				possible[auxPosition.getRow()][auxPosition.getColumn()] = true;
			}
		}
		return possible;
	}

}
