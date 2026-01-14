package ch03.sec01;
//p.89
public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        double y2 = 0; //어차피 0.0

        //System.out.println(x / y); //에러발생
        //System.out.println(x / y2); //Infinity
        //System.out.println(x % y); //에러발생
        //System.out.println(x % y2); //NaN
        double result = x / y2;
        //double result = x % y2;
        //Double.isInfinite(), Double.isNaN()
        if(Double.isNaN(result) || Double.isInfinite(result)) {
            System.out.println("연산 불가");
        } else {
            System.out.println("result: " + result);
        }
    }
}
