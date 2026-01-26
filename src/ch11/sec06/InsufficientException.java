package ch11.sec06;

//사용자 정의 예외 클래스
//Insufficient 불충분
public class InsufficientException extends Exception {
    public InsufficientException() {
    }

    public InsufficientException(String message) {
        super(message);
    }
}
