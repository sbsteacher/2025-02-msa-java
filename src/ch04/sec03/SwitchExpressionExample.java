package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        //스위치 표현식 결과값을 리턴해야할 때 좋다.
        //스위치 표현식 default 필수
        int num = (int)(Math.random() * 13.0) + 1; //1~13값
        System.out.println("num: " + num);
        String denomination = switch(num) {
            case 1 -> "A";
            case 11 -> { yield "J"; }
            case 12 -> {
                int a = 10;
                int b = 20;
                yield "Q";
            }
            case 13 -> "K";
            default -> String.valueOf(num); //정수 > 문자열
        };
        System.out.println("denomination: " + denomination);
    }
}
