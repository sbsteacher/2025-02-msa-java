package ch05.sec05;

import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args) {


        int[] arr = new int[9];
        //arr 각 방에 랜덤한 값(1~9) 대입해 주세요.
        for(int i=0; i<arr.length; i++) {
            int rVal = (int)(Math.random() * 9.0) + 1;//1~9랜덤값
            arr[i] = rVal;
        }

        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[3];
        for(int i=0; i<arr2.length; i++) { //값 대입 담당
            arr2[i] = (int)(Math.random() * 9.0) + 1;
            for(int k=0; k<i; k++) { //중복 체크 담당
                if(arr2[k] == arr2[i]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
