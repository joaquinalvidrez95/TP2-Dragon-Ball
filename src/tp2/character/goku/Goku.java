package tp2.character.goku;

import tp2.Position;
import tp2.character.Character;
import tp2.character.Team;
import tp2.character.attribute.*;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class Goku extends Character {

    public Goku(Position position) {
        super(new Health(500), new Power(20), new AttackRange(2), new Speed(2),
                new Kamehameha(), position, new Team());
    }
}
