package tp2.board;

import tp2.board.Square.SquareSet;
import tp2.exception.InvalidNumberOfSquareSet;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public class Row extends SquareSet {

    public Row(int numberOfRow) throws InvalidNumberOfSquareSet {
        super(numberOfRow);
    }
}
