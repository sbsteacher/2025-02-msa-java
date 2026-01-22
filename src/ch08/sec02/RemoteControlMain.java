package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.turnOn();
        //rc.turnOff();

        //turnOff 호출!!!
        TvRemoteControl trc = (TvRemoteControl) rc;
        trc.turnOff();

        ((TvRemoteControl) rc).turnOff();

        for(int i=0; i<20; i++) {
            rc.volumeUp();
        }
        for(int i=0; i<20; i++) {
            rc.volumeDown();
        }
    }
}
