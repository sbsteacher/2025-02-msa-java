package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6.0) + 1; // 1~6랜덤값
        //int num = 1;
        System.out.println("num: " + num);
        //짝수, 홀수
        switch (num % 2) {
            case 1:
                System.out.println("홀수");
                break;
            case 0:
                System.out.println("짝수");
                break;
        }
    }
}
