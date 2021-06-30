public class Timer {

    private int hours, minutes, seconds;

    // constructor takes in hours minutes and seconds as parameters
    public Timer(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }


    // calculates the total number of seconds int the timer
    public int calculateSeconds() {
        return (getHours() * 3600) + (getMinutes() * 60) + getSeconds();
    }

    // adds two timers and returns the sum
    public Timer add(Timer timer) {
        int hours = this.getHours() + timer.getHours();
        int minutes = this.getMinutes() + timer.getMinutes();
        int seconds = this.getSeconds() + timer.getSeconds();

        return new Timer(hours, minutes, seconds);
    }

    /*
    * Compares two timers:
    *   1. returns -1 if this timer is less than the second timer
    *   2. returns 0 if the two timers are equal
    *   3. returns 1 if this timer is greater than the second timer
    * */
    public int compare(Timer timer) {
        if(this.getHours() > timer.getHours()) {
            return 1;
        } else if(this.getHours() == timer.getHours()) {
            if(this.getMinutes() > timer.getMinutes()) {
                return 1;
            } else if(this.getMinutes() == timer.getMinutes()) {
                if(this.getSeconds() > timer.getSeconds()) {
                    return 1;
                } else if(this.getSeconds() == timer.getSeconds()) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    // decrements the number of seconds
    public void decrementSeconds() {
        this.seconds--;
        this.setSeconds(this.seconds);
    }

    // decrements the number of minutes
    public void decrementMinutes() {
        this.minutes--;
        this.setMinutes(this.minutes);
    }

    // decrements the number of hours
    public void decrementHours() {
        if(this.hours <= 0) {
            System.out.println("Cannot decrement hours further...");
        } else {
            this.hours--;
            this.setHours(this.hours);
        }
    }

    // increments the number of seconds when counting up
    public void incrementSeconds() {
        this.seconds++;
        this.setSeconds(this.seconds);
    }

    // increments the number of minutes when counting up
    public void incrementMinutes() {
        this.minutes++;
        this.setMinutes(this.minutes);
    }

    // increments the number of hours when counting up
    public void incrementHours() {
        this.hours++;
        this.setHours(this.hours);
    }

    // string representation of the timer: HH:MM:SS
    public String toString() {
        String hours = Integer.toString(getHours()).length() < 2 ? "0" + getHours() : "" + getHours();
        String minutes = Integer.toString(getMinutes()).length() < 2 ? "0" + getMinutes() : "" + getMinutes();
        String seconds = Integer.toString(getSeconds()).length() < 2 ? "0" + getSeconds() : "" + getSeconds();

        return String.format("%s:%s:%s", hours, minutes, seconds);
    }

    // initiates the countdown
    public void countDown(int seconds) {
        int i = 1;
        while(i <= seconds) {
            decrementSeconds();
            System.out.printf("%s  ", this.toString());
            i++;
        }
    }

    public int getHours() {
        return hours;
    }

    // sets the hours -> if greater than 23 then resets to 0
    public void setHours(int hours) {
        if(hours >= 0 && hours <=23) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    /*
    * Recursively sets the minutes (Recursive function)
    * If the minutes exceed 59 then recursively increment the hours by 1 as we decrement the minutes by 60
    * */
    public void setMinutes(int minutes) {
        if(minutes >= 0 && minutes <= 59) {
            this.minutes = minutes;
        } else if(minutes > 59) {
            minutes -= 60;
            this.incrementHours();
            setMinutes(minutes);
        } else {
            minutes += 60;
            this.decrementHours();
            setMinutes(minutes);
        }
    }

    public int getSeconds() {
        return seconds;
    }

    /*
     * Recursively sets the seconds (Recursive function)
     * If the seconds exceed 59 then recursively increment the minutes by 1 as we decrement the seconds by 60
     * */
    public void setSeconds(int seconds) {
        if(seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else if(seconds > 59) {
            seconds -= 60;
            this.incrementMinutes();
            setSeconds(seconds);
        } else {
            seconds += 60;
            this.decrementMinutes();
            setSeconds(seconds);
        }
    }
}
