package ch04.sec02;

public class IfElseIfElseExample2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 81.0) + 20; //20~100사이 랜덤값
        System.out.println("score: " + score);
        /* 90~100점 "A등급" 출력
           80~89점 "B등급" 출력
           70~79점 "C등급" 출력
           나머지 "D등급" 출력 */
        String result = "A";
        if(score < 70) {
            result = "D";
        } else if(score < 80) {
            result = "C";
        } else if(score < 90) {
            result = "B";
        }
        System.out.printf("%s등급\n", result);

    }
}
