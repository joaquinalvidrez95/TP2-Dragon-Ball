package tp2.board.Square;

import tp2.Position;
import tp2.character.Character;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public class Square {
    private final Position mPosition;
    private SquareState mSquareState;
    private Character mCharacter;

    public Square(Position position) {
        mPosition = position;
        mSquareState = new EmptyState();
    }

    public void setCharacter(Character character) {
        mCharacter = character;
        mSquareState = new OccupiedState();
    }

    public void clearSquare() {
        mCharacter = null;
        mSquareState = new EmptyState();
    }

    public Position getPosition() {
        return mPosition;
    }

    public boolean isAvailable() {
        return mSquareState.isEmpty();
    }
}
