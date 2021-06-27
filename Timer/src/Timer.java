public class Timer {

    private int hours, minutes, seconds;

    public Timer(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int calculateSeconds() {
        return (getHours() * 3600) + (getMinutes() * 60) + getSeconds();
    }

    public Timer add(Timer timer) {
        int hours = this.getHours() + timer.getHours();
        int minutes = this.getMinutes() + timer.getMinutes();
        int seconds = this.getSeconds() + timer.getSeconds();

        return new Timer(hours, minutes, seconds);
    }

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

    public void decrementSeconds() {
        this.seconds--;
        this.setSeconds(this.seconds);
    }

    public void decrementMinutes() {
        this.minutes--;
        this.setMinutes(this.minutes);
    }

    public void decrementHours() {
        if(this.hours <= 0) {
            System.out.println("Cannot decrement hours further...");
        } else {
            this.hours--;
            this.setHours(this.hours);
        }
    }

    public void incrementSeconds() {
        this.seconds++;
        this.setSeconds(this.seconds);
    }

    public void incrementMinutes() {
        this.minutes++;
        this.setMinutes(this.minutes);
    }

    public void incrementHours() {
        this.hours++;
        this.setHours(this.hours);
    }

    public String toString() {
        String hours = Integer.toString(getHours()).length() < 2 ? "0" + getHours() : "" + getHours();
        String minutes = Integer.toString(getMinutes()).length() < 2 ? "0" + getMinutes() : "" + getMinutes();
        String seconds = Integer.toString(getSeconds()).length() < 2 ? "0" + getSeconds() : "" + getSeconds();

        return String.format("%s:%s:%s", hours, minutes, seconds);
    }

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
