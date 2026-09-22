package chess;

import java.util.Collection;
import java.util.List;

public class MoveKnight extends PieceMovesCalc{
    public MoveKnight (ChessBoard board) {
        super(board);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        return List.of();
    }
}
