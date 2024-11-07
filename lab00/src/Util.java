import java.util.*;

public class Util {

    public static void resetPieces(List<GamePiece> pieces) {
        for (GamePiece piece: pieces) {
            piece.setRow(0);
            piece.setCol(0);
        }
    }
}