package ch05.sec05;

public class ArrayStudy {
    public static void main(String[] args) {
        //배열 생성 방법 3가지
        //1. 생성과 초기화 동시에
        int[] arr1 = { 10, 20, 30 };

        //2. 생성만, 10칸 짜리 배열이 만들어지고 그 배열의 주소값이
        // arr2에 저장됨
        int[] arr2 = new int[10];
        // -- start, 각 방의 값을 1부터 10까지 순차적으로 대입해 주세요.
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = i + 1;
        }
        // -- end
        for(int i=0; i<arr2.length; i++) {
            System.out.printf("arr2[%d]: %d\n", i, arr2[i]);
        }

        //3.생성과 초기화 동시에
        int[] arr3 = new int[]{ 10, 20, 30, 40 };

        // arr3의 모든 방의 값을 더해주세요.
        int sum = 0;
        for(int i=0; i<arr3.length; i++) {
            sum += arr3[i];
        }
        System.out.println("sum: " + sum);
    }
}
