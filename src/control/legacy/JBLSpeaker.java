package control.legacy;

import control.GenelecWoofer;
import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    //기본 생성자
    public JBLSpeaker() {
        //woofer = new GenelecWoofer();
        woofer = new MartenWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBL Speaker: 소리가 깔끔하다.");
        woofer.baseSound();
    }
}
