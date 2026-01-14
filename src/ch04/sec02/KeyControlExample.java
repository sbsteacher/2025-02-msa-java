package ch04.sec02;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        root:
        while(true) {
            System.out.println("-------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------");
            System.out.print("선택: ");
            String choice = scanner.nextLine();
            //"3"문자열이 들어오면 반복문 종료

            switch (choice) {
                case "3":
                    break root;
                case "1":
                    speed++;
                    break;
                case "2":
                    speed--;
                    break;
            }
//            if( "3".equals(choice) ) {
//                break;
//            } else if( "1".equals(choice) ) {
//                speed++;
//            } else if( "2".equals(choice) ) {
//                speed--;
//            }
            //"1"문자열이 들어오면 speed증가
            //"2"문자열이 들어오면 speed감소
            System.out.println("speed: " + speed);
        }
        System.out.println("--끝--");
    }
}
