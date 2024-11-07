import java.util.*;

public class Main {
    public static void main(String[] args) {
        GamePiece piece1 = new GamePiece("1", 0, 0);
        GamePiece piece2 = new GamePiece("2", 2, 2);

        piece1.moveGamePiece(1, 1);

        List<GamePiece> pieces = new ArrayList<>();
        pieces.add(piece1);
        pieces.add(piece2);

        Util.resetPieces(pieces);
    }
}