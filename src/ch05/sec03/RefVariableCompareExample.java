package ch05.sec03;

public class RefVariableCompareExample {
    public static void main(String[] args) {
        //자바에서 배열 만드는 방법 중 하나
        //자바에서도 배열은 객체이다.
        //진리!!!! primitive 변수를 제외한 모든 것들은 참조변수
        int a; //(primitive 타입)일반 변수

        //아래는 모두 Reference 타입이라고 부른다.
        int b[];
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = arr1; //주소값 복사!! >> 얕은 복사 Shallow Copy

        System.out.println("arr1.length: " + arr1.length);
        //arr1.length = 10; //자바의 배열의 length속성은 상수이다.
        // 레퍼런스 타입끼리의 == 비교는 주소값 비교이다.
        // 레퍼런스 타입끼리의 == 비교는 동일성 비교이다.
        // 즉, 같은 주소인가?를 물어보는 것이다.
        System.out.println( "arr1 == arr2 : " + (arr1 == arr2) );
        System.out.println( "arr1 == arr3 : " + (arr1 == arr3) );
    }
}
