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
}
