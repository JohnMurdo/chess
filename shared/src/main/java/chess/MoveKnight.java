package chess;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MoveKnight extends PieceMovesCalc{
    public MoveKnight (ChessBoard board) {
        super(board);
    }

    public Collection<ChessMove> pieceMoves(ChessPosition myPosition) {
        List<int[]> offsets = new ArrayList<>();
        offsets.add(new int[] {1,2});
        offsets.add(new int[] {-1,2});
        offsets.add(new int[] {1,-2});
        offsets.add(new int[] {-1,-2});
        offsets.add(new int[] {2,1});
        offsets.add(new int[] {2,-1});
        offsets.add(new int[] {-2,1});
        offsets.add(new int[] {-2,-1});


        return movesWithOffsets(myPosition, offsets);
    }
}
