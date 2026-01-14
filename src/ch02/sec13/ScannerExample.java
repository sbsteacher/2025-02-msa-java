package ch02.sec13;


import java.util.Scanner;

//p.73
public class ScannerExample {
    public static void main(String[] args) {
        //콘솔에서 사용자 입력을 받을 수 있게 도와주는 객체
        Scanner scanner = new Scanner(System.in);

        System.out.print("x 값 입력: ");
        int x = scanner.nextInt();

        System.out.print("y 값 입력: ");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.printf( "%d + %d = %d\n", x, y, result );

        while(true) {
            System.out.print("문자열 입력: ");
            String data = scanner.next();
            if( data.equals("q") ) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println(); //개행처리
        }
        System.out.println("-- 끝 --");
    }
}
