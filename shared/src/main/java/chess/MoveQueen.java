package chess;

import java.util.Collection;
import java.util.List;

public class MoveQueen extends PieceMovesCalc{
    public MoveQueen(ChessBoard board) {
        super(board);
    }

    @Override
    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        return List.of();
    }
}
