package ch08.sec02;

public interface RemoteControl {
    //멤버 필드를 작성한다.
    //필드 선언 앞에 public static final 이 자동으로 들어간다.
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 10;

    // 메소드 선언 앞에 public abstract 가 항상 들어가고 수정불가능하다.
    // 고로, 인터페이스에서는 리턴타입 메소드명 파라미터만 적어주시면 된다.
    void turnOn();
    void volumeUp();
    void volumeDown();
    void mute(); //음소거

}
