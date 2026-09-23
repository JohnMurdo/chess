package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static chess.ChessGame.TeamColor.WHITE;

public class MovePawn extends PieceMovesCalc{
    public MovePawn(ChessBoard board) {
        super(board);
    }

    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        ChessPiece startPiece = board.getPiece(myPosition);
        int dir = startPiece.getTeamColor() == WHITE?1:-1;
        int startRow = startPiece.getTeamColor() == WHITE? 2:7;
        int endRow = startPiece.getTeamColor() == WHITE? 8:1;
        ChessPosition forward = myPosition.offset(0,dir);
        ChessPosition attackL = myPosition.offset(-1,dir);
        ChessPosition attackR = myPosition.offset(1,dir);
        ChessPosition dubForward = myPosition.offset(0,dir*2);
        ArrayList<ChessMove> validMoves = new ArrayList<>();
        if (forward.isValid() && board.getPiece(forward) == null) {
            if (forward.getRow() == endRow) {
                validMoves.addAll(promotionMoves(myPosition, forward));
            } else {
                ChessMove pos = new ChessMove(myPosition, forward, null);
                validMoves.add(pos);
                if (dubForward.isValid() && board.getPiece(dubForward) == null && dubForward.getRow() == startRow) {
                    ChessMove pos2 = new ChessMove(myPosition, dubForward, null);
                    validMoves.add(pos2);
                }
            }
        }
        if (attackL.isValid() && board.getPiece(attackL) != null && startPiece.getTeamColor() != board.getPiece(attackL).getTeamColor()) {
            if (attackL.getRow() == endRow) {
                validMoves.addAll(promotionMoves(myPosition, attackL));
            } else {
                ChessMove pos = new ChessMove(myPosition, attackL, null);
                validMoves.add(pos);
            }

        }
        if (attackR.isValid() && board.getPiece(attackR) != null && startPiece.getTeamColor() != board.getPiece(attackR).getTeamColor()) {
            if (attackR.getRow() == endRow) {
                validMoves.addAll(promotionMoves(myPosition, attackR));
            } else {
                ChessMove pos = new ChessMove(myPosition, attackR, null);
                validMoves.add(pos);
            }

        }

        return validMoves;
    }

    public ArrayList<ChessMove> promotionMoves(ChessPosition start, ChessPosition end) {
        ArrayList<ChessMove> validMoves = new ArrayList<>();
        validMoves.add(new ChessMove(start, end, ChessPiece.PieceType.QUEEN));
        validMoves.add(new ChessMove(start, end, ChessPiece.PieceType.BISHOP));
        validMoves.add(new ChessMove(start, end, ChessPiece.PieceType.KNIGHT));
        validMoves.add(new ChessMove(start, end, ChessPiece.PieceType.ROOK));
        return validMoves;
    }
    // check start (remember color matters)
    // check kills
    // check promotion (remember color matters)
}
