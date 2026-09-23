package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MoveKing extends PieceMovesCalc{
    public MoveKing (ChessBoard board) {
        super(board);
    }

    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        List<int[]> offsets = new ArrayList<>();
        offsets.add(new int[] {1,1});
        offsets.add(new int[] {1,-1});
        offsets.add(new int[] {-1,1});
        offsets.add(new int[] {-1,-1});
        offsets.add(new int[] {0,1});
        offsets.add(new int[] {0,-1});
        offsets.add(new int[] {1,0});
        offsets.add(new int[] {-1,0});


        return movesWithOffsets(myPosition, offsets);
    }
}
