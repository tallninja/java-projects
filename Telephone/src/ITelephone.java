public interface ITelephone {

    void powerOn();
    void dial(String phoneNumber);
    void answer();
    void callPhone(String phoneNumber);
    boolean isRinging();

}
