package tp2.character.attribute;

import tp2.Position;
import tp2.character.Team;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public abstract class CharacterState {
    private Power mPower;
    private AttackRange mAttackRange;
    private Speed mSpeed;

    public CharacterState(Power power, AttackRange attackRange, Speed speed) {
        this.mPower = power;
        this.mAttackRange = attackRange;
        this.mSpeed = speed;
    }

    public Power getPower() {
        return mPower;
    }

    public void setPower(Power mPower) {
        this.mPower = mPower;
    }

    public AttackRange getAttackRange() {
        return mAttackRange;
    }

    public void setAttackRange(AttackRange mAttackRange) {
        this.mAttackRange = mAttackRange;
    }

    public Speed getSpeed() {
        return mSpeed;
    }

    public void setSpeed(Speed mSpeed) {
        this.mSpeed = mSpeed;
    }
}
