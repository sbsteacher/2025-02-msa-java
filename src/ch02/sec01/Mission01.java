package ch02.sec01;

public class Mission01 {
    public static void main(String[] args) {
        double d1 = Math.random();
        System.out.println("d1: " + d1);

        //5~17 랜덤값 나오게 해주세요.
        int rVal = (int)(Math.random() * 13.0) + 5;
        System.out.println("rVal: " + rVal);
    }
}
