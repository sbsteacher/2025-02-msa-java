package ch05.sec05;

import java.util.Arrays;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = { 10, 8, 88, 1, 100, 14, 200 };
        int[] arr2 = arr;

        arr2[1] = 77;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("arr == arr2: " + (arr == arr2));

        System.out.println("-------------------------");
        // arr과 똑같은 값을 가지고 있는 새로운 배열을 만든다.
        // 1.첫번째 해야할 일! 생성하는데 똑같은 크기의 배열을 만들어야 한다.
        int[] arr3 = new int[arr.length];
        for(int i=0; i<arr3.length; i++) {
            arr3[i] = arr[i];
        }
        arr3[1] = 99;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr));
        System.out.println("arr == arr3: " + (arr == arr3));
    }
}
