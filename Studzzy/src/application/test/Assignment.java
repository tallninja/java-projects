package application.test;

import java.util.Date;

public class Assignment extends Submission {

    /*
    * 0 -> individual assignment
    * 1 -> group assignment
    * 2 -> presentation assignment
    * */
    private int type;

    public Assignment(Unit unit, Date date, int type) {
        super(unit, date);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
