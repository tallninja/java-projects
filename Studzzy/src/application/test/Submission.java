package application.test;

import java.util.Date;

public class Submission {

    private Unit unit;
    private Date date;

    public Submission(Unit unit, Date date) {
        this.unit = unit;
        this.date = date;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
