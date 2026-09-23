package chess;

import java.util.Collection;

public class MoveBishop extends PieceMovesCalc {
    public MoveBishop (ChessBoard board) {
        super(board);
    }
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        Collection<ChessMove> moves = findValidLines(myPosition, 1, 1);
        moves.addAll(findValidLines(myPosition, -1, 1));
        moves.addAll(findValidLines(myPosition, -1, -1));
        moves.addAll(findValidLines(myPosition, 1, -1));
        return moves;
    }

}
