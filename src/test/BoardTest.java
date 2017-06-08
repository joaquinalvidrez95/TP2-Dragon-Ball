package test;

import tp2.board.Board;
import tp2.Position;
import tp2.board.Square.Square;
import org.junit.jupiter.api.Test;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class BoardTest {
    @Test
    public void skS() {
        Board board = new Board(4, 4);
        board.isNextTo(new Square(new Position(2, 3)));
    }
}
