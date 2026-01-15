package ch05.sec03;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] arr = null; //null은 주소값 없다는 의미

        // NPE 발생, 가리키는 객체가 없는데
        // 속성값 읽기 혹은 메소드 호출하면 예외발생한다.
        //int len = arr.length;

        String input = "3";

        if("3".equals(input)) {
            System.out.println("정지");
        }
        System.out.println("끝!");
    }
}
