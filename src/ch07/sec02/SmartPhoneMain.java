package ch07.sec02;

public class SmartPhoneMain {
    public static void main(String[] args) {
        //모델명: 갤럭시
        //색상: 은색
        //정보를 갖는 스마트폰 객체 생성해 주세요.
        SmartPhone sp = new SmartPhone("갤럭시", "은색");
        sp.toggleWifi(); //true
        sp.toggleWifi(); //false
        sp.toggleWifi(); //true

        //부모가 가지고 있는 메소드를 호출할 수 있다.
        sp.bell();
        sp.hangUp();
        sp.sendMessage("반가워~");

    }
}
