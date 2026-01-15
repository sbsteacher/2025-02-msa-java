package ch05.sec05;

import java.util.Arrays;

public class ArrayValueAdd2 {
    public static void main(String[] args) {
        //논리!! 배열의 크기는 한번 정해지면 수정할 수 없다.
        int[] arr = { 2, 4, 8, 10, 11 };

        int value = 22;
        int idx = 2;
        // [ 2, 4, 22, 8, 10, 11 ]
        int[] arr2 = new int[arr.length + 1];

        arr2[idx] = value;
        //방법(1)
        for(int i=0; i<idx; i++) {
            arr2[i] = arr[i];
        }
        for(int i=idx; i<arr.length; i++) {
            arr2[i + 1] = arr[i];
        }
        //방법(2)
//        for(int i=0; i<arr.length; i++) {
//            arr2[i < idx ? i : i + 1] = arr[i];
//        }

        System.out.println(Arrays.toString(arr2));
    }
}
