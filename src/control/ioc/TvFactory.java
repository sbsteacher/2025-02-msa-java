package control.ioc;

import control.*;

public class TvFactory {
    public static Tv generateTv(String wooferName, String speakerName) {
        //wooferName매개변수에 담겨져있는 문자열이 "marten"이면 MartenWoofer객체화
        //"genelec"이면 GenelecWoofer 객체화
        Woofer woofer = switch (wooferName.toLowerCase()) {
            case "marten" -> new MartenWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };

        //speakerName매개변수에 담겨져있는 문자열이 "jbl"이면 JBLSpeaker객체화
        //"harman"이면 HarmanSpeaker객체화
        Speaker speaker = switch (speakerName.toLowerCase()) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}
