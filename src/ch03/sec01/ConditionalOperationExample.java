package ch03.sec01;
//
public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 91.0) + 10; //10 ~ 100점 사이 랜덤값
        System.out.println("score: " + score);

        /* 삼항식을 이용한다. 90점 초과는 콘솔에 "A" 출력,
        80점 초과는 "B"출력, 나머지는 "C"출력
        오로지, 삼항식만 이용!!
        */
        String result = score > 90 ? "A"
                                   : (score > 80 ? "B"
                                                : "C");
        System.out.println("result: " + result);
    }
}
