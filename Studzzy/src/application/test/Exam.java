package application.test;

import java.util.Date;

public class Exam extends Test{

    public Exam(Unit unit, Date date) {
        this.setTestDate(date);
        this.setUnit(unit);
    }

}
