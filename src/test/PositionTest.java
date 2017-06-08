package test;

import tp2.Position;
import tp2.exception.InvalidNumberOfSquareSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class PositionTest {
    @Test
    public void equals_ObjectSameFields_ShouldBeTrue() throws InvalidNumberOfSquareSet {
        Position position = new Position(2, 3);
        Position anotherPosition = new Position(2, 3);

        assertTrue(position.equals(anotherPosition));
    }

    @Test
    public void equals_ObjectDifferentFields_ShouldBeFalse() throws InvalidNumberOfSquareSet {
        Position position = new Position(2, 3);
        Position anotherPosition = new Position(4000, 200);

        assertFalse(position.equals(anotherPosition));
    }
}
