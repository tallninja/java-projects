package application.test;

import java.util.Date;

public class Test extends Reminder {

    private Unit unit;
    private Date testDate;

    public Test(Unit unit, Date testDate) {
        this.unit = unit;
        this.testDate = testDate;
    }

    public Test() {

    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }
}
