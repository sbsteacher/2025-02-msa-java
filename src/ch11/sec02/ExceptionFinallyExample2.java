package ch11.sec02;

public class ExceptionFinallyExample2 {
    public static void main(String[] args) {
        //System.out.println(div(10, 3));
        System.out.println(div(10, 0));
    }

    public static int div(int n1, int n2) {
        try {
            System.out.println("하하");
            return n1 / n2;
        } catch (Exception e) {
            System.out.println("예외 발생");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("try 바깥쪽!!");
        return 0;
    }
}
