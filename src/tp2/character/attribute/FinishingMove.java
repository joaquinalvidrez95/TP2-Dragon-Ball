package tp2.character.attribute;

import tp2.character.Character;
import tp2.exception.InsufficientKi;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public abstract class FinishingMove {
    private Ki mCost;
    private Character mCharacter;

    public FinishingMove(Ki cost, Character character) {
        this.mCost = cost;
        mCharacter = character;
    }

    public void doFinishingMove() throws InsufficientKi {
        Ki kiOfCharacter = mCharacter.getKi();
        if (!kiOfCharacter.isEqualOrGreater(mCost)) {
            throw new InsufficientKi();
        }
    }
}
