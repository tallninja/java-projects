package application.test;

import java.util.Date;

public class Reminder {

    private String description;
    private Date reminderDate;

    public Reminder(String description, Date reminderDate) {
        this.description = description;
        this.reminderDate = reminderDate;
    }

    public Reminder() {
    }

    public void setReminder(String description, Date date) {
        setDescription(description);
        setReminderDate(date);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }
}
