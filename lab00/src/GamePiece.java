import java.util.*;

public class GamePiece {
    private String type;
    private int row;
    private int col;

    public GamePiece(String t, int r, int c) {
        type = t;
        row = r;
        col = c;
    }

    public void moveGamePiece(int x, int y) {
        row += y;
        col += x;
    }
    public void setRow(int val) {row = val;}

    public void setCol(int val) {col = val;}
}