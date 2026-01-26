package ch08.sec05;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void setVolume(int volume);

    //인터페이스도 추상클래스처럼 구현부가 있는 메소드 만들 수 있었으면 좋겠다.
    //디폴트 메소드
    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제합니다.");
        }
        defaultStaticCommon(1);
    }

    //스태틱 메소드(클래스 메소드)는 가질 수 있다.
    static void changeBattery() {
        System.out.println("배터리를 교환합니다.");
    }

    //private 일반 메소드, private static 메소드
    // >>> default, static 메소드가 여러개 일 때 중복처리를 메소드로 처리하기 위해 존재
    private String defaultCommon() {

        return "";
    }

    private static void defaultStaticCommon(int n1) {

    }
}
