package control.ioc;

import control.Speaker;
import control.Tv;

public class SamsungTv implements Tv {

    private Speaker speaker;

    public SamsungTv(Speaker speaker) { //DI, 외부에서 주입받은 객체 걍 써~
        this.speaker = speaker;
    }

    @Override
    public void sound() {
        System.out.println("Samsung Tv의 소리는요");
        speaker.speakerSound();
    }
}
