package ch08.sec02;

/* 인터페이스를 상속받을 땐 implements 키워드를 사용한다. 그리고
인터페이스를 상속받는다라고 표현하지 않고 구현한다라고 표현한다.
*/
public class TvRemoteControl implements RemoteControl {
    private int volume = MIN_VOLUME;
    private int memoryVolume;
    private boolean mute;

    //MAX_VOUMNE 초과는 되지 않도록 해주세요.
    @Override
    public void turnOn() {
        System.out.println("Tv를 켠다");
    }

    @Override
    public void volumeUp() {
        if(volume < MAX_VOLUME) {
            volume++;
        }
        displayVolume();
    }

    @Override
    public void volumeDown() {
        if(volume > MIN_VOLUME) {
            volume--;
        }
        displayVolume();
    }

    @Override
    public void mute() {
        mute = !mute;
        if(mute) {
            memoryVolume = volume;
            volume = 0;
            System.out.print("(음소거) ");
        } else {
            volume = memoryVolume;
        }
        displayVolume();
    }

    private void displayVolume() {
        System.out.printf("볼륨: %d\n", volume);
    }

    public void turnOff() {
        System.out.println("Tv를 끄다.");
    }


}
