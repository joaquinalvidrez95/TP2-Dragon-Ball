package tp2;

import java.util.Objects;

/**
 * Created by joaquinalan on 06/06/2017.
 */
public class Position {
    private int mRow;
    //private SquareSet mRow;
    //private SquareSet mColumn;
    private int mColumn;

    public Position(int row, int column) {
        this.mRow = row;
        this.mColumn = column;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        //return mRow.getNumber() == position.mRow.getNumber() &&
        ////Objects.equals(mColumn.getNumber(), position.mColumn.getNumber());
//                mColumn.getNumber() == position.mColumn.getNumber();
        return mRow == position.mRow &&
                mColumn == position.mColumn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mRow, mColumn);
    }
}
