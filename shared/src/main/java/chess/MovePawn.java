package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static chess.ChessGame.TeamColor.WHITE;

public class MovePawn extends PieceMovesCalc{
    private

    public MovePawn(ChessBoard board) {
        super(board);
    }

    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        ChessPiece startPiece = board.getPiece(myPosition);
        int dir = startPiece.getTeamColor() == WHITE?1:-1;
        int startRow = startPiece.getTeamColor() == WHITE? 2:7;
        int endRow = startPiece.getTeamColor() == WHITE? 8:1;


        return null;
    }
    // check start (remember color matters)
    // check kills
    // check promotion (remember color matters)
}
