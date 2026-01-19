package ch06.sec08;

public class PracticeMethodMain {
    public static void main(String[] args) {
        //PracticeMethod 객체화 해주세요.
        PracticeMethod pm = new PracticeMethod();
        pm.abs(10); //10
        pm.abs(-10); //10
        pm.abs(-8); //8

        int r1 = pm.random(10); //0~9랜덤값 리턴
        int r2 = pm.random(20); //0~19랜덤값 리턴

        System.out.println("r1: " + r1 + ", r2: " + r2);

        int r3 = pm.random(2, 10); //2~9 랜덤값 리턴
        int r4 = pm.random(10, 15); //10~14 랜덤값 리턴
        /* 90점 초과는 콘솔에 "A", 80점 초과는 "B", 나머지는 "C" 리턴 */
        String grade = pm.getGrade(100);
        System.out.println("grade: " + grade);

        int score = pm.random(30, 101);
        System.out.println("score: " + score);
        System.out.println(pm.getGrade(score));

        pm.printStar(5); //*****
        pm.printStar(3); //***
        System.out.println("----");
        pm.printStarTriangle(4);
        //*
        //**
        //***
        //****
        System.out.println("----");
        pm.printStarRectangle(4);
        //****
        //****
        //****
        //****
        pm.gugudan(7);
        //5 x 1 = 5
        //5 x 2 = 10
        //...
        //5 x 9 = 45
        System.out.println("-------------");
        pm.gugudan(3, 6); //3~6단 구구단 출력

        int sum = pm.sum(10, 50); //10~50까지 순차적으로 더한값을 리턴
        System.out.println("sum: " + sum);
    }
}
