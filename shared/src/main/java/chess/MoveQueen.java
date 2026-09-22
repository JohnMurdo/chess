package chess;

import java.util.Collection;

public class MoveQueen extends PieceMovesCalc{
    public MoveQueen (ChessBoard board) {
        super(board);
    }
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        Collection<ChessMove> moves = findLineMoves(myPosition, 1, 1);
        moves.addAll(findLineMoves(myPosition, -1, 1));
        moves.addAll(findLineMoves(myPosition, -1, -1));
        moves.addAll(findLineMoves(myPosition, 1, -1));
        moves.addAll(findLineMoves(myPosition, 0, 1));
        moves.addAll(findLineMoves(myPosition, 0, -1));
        moves.addAll(findLineMoves(myPosition, -1, 0));
        moves.addAll(findLineMoves(myPosition, 1, 0));
        return moves;
    }
}
