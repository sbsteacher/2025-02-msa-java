package ch06.sec08;

public class PracticeMethod {
    public void abs(int num) {
        System.out.println(num < 0 ? -num : num);
    }

    public int random(int num) {
        int result = (int)(Math.random() * num);
        return result;
    }

    public int random(int min, int max) {
        int result = (int)(Math.random() * (max - min)) + min;
        return result;
    }

    public String getGrade(int score) {
        if(score > 90) {
            return "A";
        } else if(score > 80) {
            return "B";
        }
        return "C";
    }

    public void printStar(int star) {
        for(int i=0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printStarTriangle(int star) {
        for(int i=1; i<=star; i++) {
            printStar(i);
        }
    }

    public void printStarRectangle(int star) {
        for(int i=0; i<star; i++) {
            printStar(star);
        }
    }

    public void gugudan(int dan) {
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    public void gugudan(int startDan, int endDan) {
        for(int i=startDan; i<=endDan; i++) {
            gugudan(i);
        }
    }

    public int sum(int starValue, int endValue) {
        int sum = 0;
        for(int i=starValue; i<=endValue; i++) {
            sum += i;
        }
        return sum;
    }


}
