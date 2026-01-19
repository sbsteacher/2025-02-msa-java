package ch06.sec09;

import java.util.Arrays;

public class ArrayListStringMain {
    public static void main(String[] args) {
        ArrayListString list = new ArrayListString();

        System.out.println(Arrays.toString(list.arr));
        list.add("하하"); //0
        System.out.println(Arrays.toString(list.arr));
        list.add("후후"); //1
        System.out.println(Arrays.toString(list.arr));
        list.add("크크"); //2
        System.out.println(Arrays.toString(list.arr));
        list.add("와우"); //3
        System.out.println(Arrays.toString(list.arr));
        list.add("대단해"); //4
        System.out.println(Arrays.toString(list.arr));

        String val = list.get(1);
        System.out.println("val: " + val); //val: 후후

        String val2 = list.arr[1];
        System.out.println("val2: " + val2);

        //가장 마지막방에 있는 값 삭제, 삭제 한 값 리턴
        String removeVal = list.remove();
        System.out.println("removeVal: " + removeVal);
        System.out.println(Arrays.toString(list.arr));
        list.add(1, "나야");
        System.out.println(Arrays.toString(list.arr));//하하, 나야, 후후, 크크, 와우
        String removeVal2 = list.remove(2);
        System.out.println("removeVal2: " + removeVal2); // 후후
        System.out.println(Arrays.toString(list.arr)); // [ 하하, 나야, 크크, 와우 ]
        String removeVal3 = list.get(1); //주소값으로 해야 함.
        System.out.println("removeVal3: " + removeVal3);
        list.remove(removeVal3);
        System.out.println(Arrays.toString(list.arr)); // [ 하하, 크크, 와우 ]
    }
}

