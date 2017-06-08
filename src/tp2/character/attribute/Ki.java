package tp2.character.attribute;

/**
 * Created by joaquinalan on 07/06/2017.
 */
public class Ki {
    private int mKi;

    public Ki() {
        mKi = 0;
    }

    public Ki(int ki) {
        mKi = ki;
    }

    boolean isEqualOrGreater(Ki ki) {
        return mKi >= ki.getKi();
    }


    public int getKi() {
        return mKi;
    }

    public void setKi(int ki) {
        mKi = ki;
    }
}
