package ch04.sec02;

public class SumFor {
    public static void main(String[] args) {
        //for문을 활용하여 1~100 모두 더한 값 출력하시오.
        int sum = 0;
        for(int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
