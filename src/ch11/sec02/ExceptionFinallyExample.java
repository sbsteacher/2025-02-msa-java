package ch11.sec02;

public class ExceptionFinallyExample {
    public static void main(String[] args) {
        System.out.println(div(10, 3));
        System.out.println(div(10, 0));
    }

    public static int div(int n1, int n2) {
        System.out.println("하하");
        return n1 / n2;
    }
}
