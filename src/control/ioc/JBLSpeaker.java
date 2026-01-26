package control.ioc;

import control.MartenWoofer;
import control.Speaker;
import control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    @Override
    public void speakerSound() {
        System.out.println("JBL Speaker: 소리가 깔끔하다.");
        woofer.baseSound();
    }
}
