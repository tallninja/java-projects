public class Telephone implements ITelephone {

    private final String phoneNumber;
    private boolean isRinging;

    public Telephone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Phone is powered on !");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now dialing" + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Answered the phone !");
    }

    @Override
    public void callPhone(String phoneNumber) {
        if(this.phoneNumber == phoneNumber) {
            this.isRinging = true;
            System.out.println("Ring Ring");
        } else {
            this.isRinging = false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
