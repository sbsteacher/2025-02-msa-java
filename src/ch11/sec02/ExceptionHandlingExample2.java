package ch11.sec02;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        printLength("ThisIsJava");
        System.out.println("-------------");
        printLength(null);
        System.out.println("끝!!");
    }

    public static void printLength(String data) {
        //예외가 발생될 가능성이 있는 코드를 try{}로 감싼다.
        //예외가 발생되지 않으면 try{}코드가 모두 실행된다.
        //그러나 예외가 발생된다면 catch가 그 예외를 잡는다.
        try {
            System.out.println("시작!!!");
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (Exception e) { //예외가 발생되었을 때만 실행!
            System.out.println("예외 발생!!!");
            e.printStackTrace();
        } finally { //무조건 실행!
            System.out.println("Finally!!");
        }
        System.out.println("얘도 항상 실행된다!!!");
    }
}
