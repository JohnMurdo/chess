package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class  PieceMovesCalc {
    ChessBoard board;
    public PieceMovesCalc (ChessBoard board) {
        this.board = board;
    }
    public Collection<ChessMove> findValidLines(ChessPosition start, int changeX, int changeY){
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
    public Collection<ChessMove> movesWithOffsets (ChessPosition start, List<int[]> offsets) {
        ArrayList<ChessMove> validMoves = new ArrayList<>();
        ChessPiece startPiece = board.getPiece(start);
        for (int[] offset : offsets) {
            ChessPosition next = start.offset(offset[0], offset[1]);
            if (next.isValid()) {
                ChessPiece temp = board.getPiece(next);
                if (temp == null || temp.getTeamColor() != startPiece.getTeamColor()) {
                    ChessMove pos = new ChessMove(start, next, null);
                    validMoves.add(pos);
                }
            }
        }

        return validMoves;
    }
    // at end add on

    public abstract Collection<ChessMove> pieceMoves(ChessPosition myPosition);
}
