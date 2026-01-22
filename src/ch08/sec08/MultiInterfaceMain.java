package ch08.sec08;

public class MultiInterfaceMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();
        //rc.search("");

        SmartTelevision st = (SmartTelevision) rc;
        st.turnOn();
        st.turnOff();
        st.search("www.naver.com");
    }
}
