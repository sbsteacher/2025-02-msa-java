package ch16.sec01;

@FunctionalInterface //이 애노테이션의 역할은 추상메소드가 2개 있으면 에러 터진다.
public interface Calculable {
    void calculate(int x, int y);
}
