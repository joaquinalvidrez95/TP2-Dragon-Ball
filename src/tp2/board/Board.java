package tp2.board;

import tp2.Position;
import tp2.board.Square.Square;
import tp2.board.Square.SquareCollection;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public class Board {
    private final int mNumberOfRows;
    private final int mNumberOfColumns;
    private final SquareCollection mSquareCollection;

    public Board(int numberOfRows, int numberOfColumns) {
        mNumberOfRows = numberOfRows;
        mNumberOfColumns = numberOfColumns;
        mSquareCollection = new SquareCollection();
        setupBoard();
    }

    private void setupBoard() {
        for (int numberOfColumn = 1; numberOfColumn <= mNumberOfColumns; numberOfColumn++) {
            for (int numberOfRow = 1; numberOfRow <= mNumberOfRows; numberOfRow++) {
                Position position = new Position(numberOfRow, numberOfColumn);
                Square square = new Square(position);
                mSquareCollection.addSquare(square);
            }
        }
    }

    public boolean isNextTo(Square square) {
        return false;
    }
}
