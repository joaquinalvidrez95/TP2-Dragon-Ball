package tp2.character.goku;

import tp2.Position;
import tp2.character.Character;
import tp2.character.attribute.FinishingMove;
import tp2.character.attribute.Ki;
import tp2.exception.InsufficientKi;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class Kamehameha extends FinishingMove {
    public Kamehameha() {
        super(new Ki(20), new Goku(new Position(3,2)));
    }

    @Override
    public void doFinishingMove() throws InsufficientKi {
        super.doFinishingMove();
    }
}
