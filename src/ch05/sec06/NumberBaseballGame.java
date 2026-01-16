package ch05.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        //System.out.println("args[0]: " + args[0]);
        //어떤 숫자가 역할을 하면 매직넘버라고 부르며 보통 상수/변수로 관리한다.
        final int COUNT = args.length == 1 ? Integer.parseInt(args[0]) : 3; //자바에서 상수 만드는 방법 (final 붙이면 된다.)
        System.out.printf("------ 숫자 야구 게임 (%d) ------\n", COUNT);
        Scanner scanner = new Scanner(System.in);

        //맞춰야되는 숫자들
        int[] questions = new int[COUNT];

        //questions에 중복되지 않는 숫자(1~9)를 배열의 길이만큼 채워야 한다.
        for(int i=0; i<questions.length; i++) {
            questions[i] = (int)(Math.random() * 9.0) + 1;

            for(int k=0; k<i; k++) { //k가 이전에 넣은 값, i가 방금 넣은 값
                if(questions[k] == questions[i]) { //중복되네!!
                    i--; //i번방 다른 값 가져오기 위한 작업
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(questions));

        while(true) {
            //숫자 3개를 입력받는다.
            System.out.print("answer >> ");
            String answer = scanner.nextLine();
            //System.out.println(answer);

            //answer 문자열을 이용하여 " " 기준으로 값들을 쪼개서 배열로 만들고 싶다.
            String[] strAnswers = answer.split(" ");

            int[] answers = new int[strAnswers.length];
            for(int i=0; i< strAnswers.length; i++) {
                answers[i] = Integer.parseInt(strAnswers[i]);
            }
            //System.out.println(Arrays.toString(answers));

            int s = 0, b = 0;
            for(int i=0; i<questions.length; i++) {
                for(int k=0; k<answers.length; k++) {
                    if(questions[i] == answers[k]) {
                        if(i == k) {
                            s++;
                        } else {
                            b++;
                        }
                    }
                }
            }
            System.out.printf("S: %d, B: %d, O: %d\n", s, b, (COUNT - (s + b)));

            //while문을 빠져나가야 하는 조건
            if(s == COUNT) { break; }
        }
        System.out.println("-- 끝 --");
    }

}
