package application.test;

import java.util.Date;

public class Cat extends Test{

    /*
    * 0 -> sitting cat
    * 1 -> take-away cat
    **/
    private int type;

    public Cat(Unit unit, Date date, int type) {
        this.type = type;
        this.setUnit(unit);
        this.setTestDate(date);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type=" + type + "," +
                "description=" + this.getDescription() + "," +
                "date=" + this.getReminderDate() +
                '}';
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


}
