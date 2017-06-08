package tp2.board.Square;

import tp2.Position;

import java.util.Hashtable;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public class SquareCollection {
    private Hashtable<Position, Square> mSquares;

    public SquareCollection() {
        this.mSquares = new Hashtable();
    }

    public void addSquare(Square square) {
        mSquares.put(square.getPosition(), square);
    }


    public boolean existsSquare(Position position) {
        return mSquares.containsKey(position);
    }

    public Square getSquare(Position position) {
        return mSquares.get(position);
    }
}
