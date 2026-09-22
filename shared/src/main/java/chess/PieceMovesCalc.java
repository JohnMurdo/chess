package chess;

import java.util.ArrayList;
import java.util.Collection;

public abstract class  PieceMovesCalc {
    ChessBoard board;
    public PieceMovesCalc (ChessBoard board) {
        this.board = board;
    }
    public Collection<ChessMove> findLineMoves (ChessPosition start, int changeX, int changeY){
        ChessPosition next = start.offset(changeX, changeY);
        ArrayList<ChessMove> validMoves = new ArrayList<>();
        ChessPiece startPiece = board.getPiece(start);
        while (next.isValid()){
            ChessPiece temp = board.getPiece(next);

            if (temp == null) {
                ChessMove pos = new ChessMove(start, next, null);
                validMoves.add(pos);
            } else if (temp.getTeamColor() == startPiece.getTeamColor()){
                break;
            } else {
                ChessMove pos = new ChessMove(start, next, null);
                validMoves.add(pos);
                break;
            }
            next = next.offset(changeX, changeY);
        }
        return validMoves;
    }
//    public movesWithOffsets;
    public abstract Collection<ChessMove> pieceMoves(ChessPosition myPosition);
}
