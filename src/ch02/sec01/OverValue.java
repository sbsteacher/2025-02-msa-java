package ch02.sec01;

public class OverValue {
    public static void main(String[] args) {
        byte b1 = -128;
        System.out.println("b1: " + b1);
        //byte b2 = -129;  //안된다! 그릇이 1L짜리인데 1.1L물을 넣으려고 한거다.
        byte b3 = 127;
        System.out.println("b3: " + b3);
        //byte b4 = 128; //안된다! 그릇이 1L짜리인데 1.1L물을 넣으려고 한거다.

        // int 4byte, long 8byte
        // 정수 리터럴은 기본적으로 int타입이다. l, L을 붙여서 long타입으로 변경한다.
        long l1 = 100_000_000_000_000L;
        System.out.println("l1: " + l1);
        //long l2 = 9_200_000_000_000_000_000L; //안된다! 그릇이 10L짜리인데 10.1L물을 넣으려고 한거다.
        long l3 = 2_147_483_647; //int가 저장할 수 있는 값은 L을 안 붙여도 된다.

        //double 8byte, float 4byte
        //실수 리터럴은 기본적으로 double 타입이다. d, D를 붙여도 되고 안 붙여도 된다.
        double d1 = 10.1;

        // float f1 = 10.1; //더 큰 쪽에서 작은 쪽으로 데이터를 옮길 때는 자동형변환 해주지 않는다.
        float f2 = 10.1f; //리터럴에 f, F를 붙이면 float타입의 리터럴이 된다.
        double d2 = f2; //자동형변환이 된다. float > double타입으로 변경. 작은쪽에서 큰쪽으로는 자동형변환 해준다.


        long l2 = 100_000_000_000_000L;
        //float, double은 지수계산으로 저장하기 때문에 아주 큰 값도 저장 가능하다. 하지만 정확도는 조금 떨어진다.
        float f3 = l2;

        // byte < short, char < int < long < float < double
        // 좌측에서 우측으로는 자동형변환 된다.
        // 우측에서 좌측으로는 자동형변환 되지 않는다.

        long l4 = 10L;
        int i1 = (int)l4; //강제형변환
        System.out.println("l4: " + l4);
        System.out.println("i1: " + i1);

        //byte -128 ~ 127 범위의 값을 저장할 수 있다.
        int i2 = 129;
        byte b4 = (byte)i2; //오버플로우
        System.out.println("b4: " + b4);

        int i3 = -129;
        byte b5 = (byte)i3; //언더플로우
        System.out.println("b5: " + b5);
    }
}
