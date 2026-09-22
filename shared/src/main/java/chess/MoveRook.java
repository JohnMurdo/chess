package chess;

import java.util.Collection;
import java.util.List;

public class MoveRook extends PieceMovesCalc{
    public MoveRook(ChessBoard board) {
        super(board);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        return List.of();
    }
}
