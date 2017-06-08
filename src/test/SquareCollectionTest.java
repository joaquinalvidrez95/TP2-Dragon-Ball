package test;

import tp2.Position;
import tp2.board.Square.Square;
import tp2.board.Square.SquareCollection;
import tp2.exception.InvalidNumberOfSquareSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class SquareCollectionTest {
    @Test
    public void existsSquare_ExistingSquare_ShouldBeTrue() throws InvalidNumberOfSquareSet {
        SquareCollection squareCollection = new SquareCollection();
        Position position = new Position(2, 3);

        squareCollection.addSquare(new Square(position));

        assertTrue(squareCollection.existsSquare(position));
    }

    @Test
    public void existsSquare_NotExistingSquare_ShouldBeFalse() throws InvalidNumberOfSquareSet {
        SquareCollection squareCollection = new SquareCollection();
        Position position = new Position(2, 3);
        Position anotherPosition = new Position(222, 666);

        squareCollection.addSquare(new Square(position));

        assertFalse(squareCollection.existsSquare(anotherPosition));
    }
}
