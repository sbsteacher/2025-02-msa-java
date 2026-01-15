package ch05.sec05;

import java.util.Arrays;

public class ArrayValueRemove {
    public static void main(String[] args) {
        //논리!! 배열의 크기는 한번 정해지면 수정할 수 없다.
        int[] arr = { 2, 4, 8, 10, 12, 13, 20, 111, 2222 }; //6

        //제일 마지막 값을 제외한 배열을 만들고 싶다.
        int[] arr2 = new int[arr.length - 1]; //5
        for(int i=0; i<arr2.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
