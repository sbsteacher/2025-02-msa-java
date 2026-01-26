package control.ioc;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer; //Woofer를 implements한 객체 주소값 가질 수 있다.

    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("Harman Speaker: 소리가 맑아요.");
        woofer.baseSound();
    }
}
