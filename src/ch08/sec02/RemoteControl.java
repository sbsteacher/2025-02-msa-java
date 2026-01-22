package ch08.sec02;

public interface RemoteControl {
    // 메소드 선언 앞에 public abstract 가 항상 들어가고 수정불가능하다.
    // 고로, 인터페이스에서는 리턴타입 메소드명 파라미터만 적어주시면 된다.
    void turnOn();
}
