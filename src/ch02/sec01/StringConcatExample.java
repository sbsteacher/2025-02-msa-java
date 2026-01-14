package ch02.sec01;

public class StringConcatExample {
    public static void main(String[] args) {
        System.out.println( "result1: " + (10 + 2 + 8) ); //20
        System.out.println( "result2: " + (10 + 2 + "8") ); //128
        System.out.println( "result3: " + (10 + "2" + 8) ); //1028
        System.out.println( "result4: " + ("10" + 2 + 8) ); //1028
        System.out.println( "result4: " + ("10" + (2 + 8)) ); //1010


        //문자열에 저장된 숫자를 숫자형으로 형변환
        String str1 = "10";
        int i1 = Integer.parseInt(str1);
        System.out.println( "i1: " + (i1 + i1) );

        String str2 = "10.6";
        float f1 = Float.parseFloat(str2);
        double d1 = Double.parseDouble(str2);
        //Wrapper 클래스 (Integer, Double, Float, Long 등등)
        System.out.println( "f1: " + (f1 + f1) );
        System.out.println( "d1: " + (d1 + d1) );
    }
}
