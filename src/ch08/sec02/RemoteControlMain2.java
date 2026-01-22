package ch08.sec02;

public class RemoteControlMain2 {
    public static void main(String[] args) {
        RemoteControl rc = new TvRemoteControl();
        rc.volumeUp();
        rc.volumeUp();
        rc.volumeUp(); //볼륨: 3

        rc.mute(); //볼륨: 0
        rc.mute(); //볼륨: 3
        rc.mute(); //볼륨: 0
        rc.mute(); //볼륨: 3

    }
}
