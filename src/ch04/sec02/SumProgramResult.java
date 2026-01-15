package ch04.sec02;

import java.util.Scanner;

/*
숫자를 입력해 주세요 (종료: 0) >> 5
숫자를 입력해 주세요 (종료: 0) >> 10
숫자를 입력해 주세요 (종료: 0) >> 3
숫자를 입력해 주세요 (종료: 0) >> 0

합계: 18
*/
public class SumProgramResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("숫자를 입력해 주세요 (종료: 0) >> ");
            try {
                int input = scanner.nextInt();
                if(input == 0) { break; }
                sum += input;
            } catch (Exception e) {
                System.out.println("숫자만 입력해 주세요.");
                scanner.nextLine(); //nextInt() 개행이 남아 있어서 개행 제거용
            }
        }
        System.out.println("합계: " + sum);
    }
}
