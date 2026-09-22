package chess;

import java.util.Collection;
import java.util.List;

public class MoveKing extends PieceMovesCalc{
    public MoveKing (ChessBoard board) {
        super(board);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        return List.of();
    }
}
