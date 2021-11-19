package application.test;

import java.util.Date;

public class Report extends Submission {

    /*
    * 0 -> individual report
    * 1 -> group report
    * */
    private int type;

    public Report(Unit unit, Date date, int type) {
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
