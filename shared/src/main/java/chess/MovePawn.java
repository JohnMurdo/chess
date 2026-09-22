package chess;

import java.util.Collection;
import java.util.List;

public class MovePawn extends PieceMovesCalc{
    public MovePawn(ChessBoard board) {
        super(board);
    }


    @Override
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        return List.of();
    }
}
