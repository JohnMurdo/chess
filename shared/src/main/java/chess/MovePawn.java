package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MovePawn extends PieceMovesCalc{
    public MovePawn(ChessBoard board) {
        super(board);
    }

    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        List<int[]> offsets = new ArrayList<>();
        Collection<ChessMove> moves = null;// findValidLines(myPosition, offsets);
        offsets.add(new int[] {0,1});

        return moves;
    }
    // check start (remember color matters)
    // check kills
    // check promotion (remember color matters)
}
