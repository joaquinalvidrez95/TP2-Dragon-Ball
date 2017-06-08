package tp2.board.Square;

import tp2.exception.InvalidNumberOfSquareSet;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public abstract class SquareSet {
    private int mNumber;

    public SquareSet(int numberOfSquareSet) throws InvalidNumberOfSquareSet {
        if (numberOfSquareSet <= 0) {
            throw new InvalidNumberOfSquareSet();
        }
        this.mNumber = numberOfSquareSet;
    }


    public int getNumber() {
        return mNumber;
    }
}
