package tp2.character;

import tp2.Position;
import tp2.character.attribute.*;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public abstract class Character {
    private Health mHealth;
    private Power mPower;
    private AttackRange mAttackRange;
    private Speed mSpeed;
    private Ki mKi;
    private FinishingMove mFinishingMove;
    private Position position;
    private Team mTeam;
    private CharacterState characterState;

    public Character(Health health, Power power, AttackRange attackRange, Speed speed,
                     FinishingMove finishingMove, Position position, Team team) {
        this.mHealth = health;
        this.mPower = power;
        this.mAttackRange = attackRange;
        this.mSpeed = speed;
        this.mKi = new Ki(0);
        this.mFinishingMove = finishingMove;
        this.position = position;
        this.mTeam = team;
        characterState = new NormalState(power, attackRange, speed);
    }

    public void move() {

    }

    public Health getHealth() {
        return mHealth;
    }

    public void setHealth(Health mHealth) {
        this.mHealth = mHealth;
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

    public Ki getKi() {
        return mKi;
    }

    public void setKi(Ki mKi) {
        this.mKi = mKi;
    }

    public FinishingMove getFinishingMove() {
        return mFinishingMove;
    }

    public void setFinishingMove(FinishingMove mFinishingMove) {
        this.mFinishingMove = mFinishingMove;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Team getTeam() {
        return mTeam;
    }

    public void setTeam(Team mTeam) {
        this.mTeam = mTeam;
    }

    public void transform() {

    }
}
