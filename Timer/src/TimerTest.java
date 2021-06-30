public class TimerTest {

    public static void main(String[] args) {
        Timer timer1 = new Timer(1, 2, 0);
        Timer timer2 = new Timer(6, 14, 110);
        Timer timer3 = new Timer(5, 20, -10);
        Timer timer4 = new Timer(1, -20, -10);

        System.out.println("timer1 = " + timer1.toString());
        System.out.println("timer2 = " + timer2.toString());
        System.out.println("timer3 = " + timer3.toString());
        System.out.println("timer4 = " + timer4.toString());
        System.out.println();

        System.out.println("timer1 converted to seconds = " + timer1.calculateSeconds());
        System.out.println();

        Timer result = timer1.add(timer2);
        System.out.println("timer1 + timer2 = " + result.toString());
        System.out.println();

        System.out.println("timer1 compared to timer2 = " + timer1.compare(timer2));
        System.out.println();

        System.out.printf("Countdown has started...%n%n");
        timer1.countDown(300);
        System.out.printf("%n%nCountdown has finished...%n");
    }

}
