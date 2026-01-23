package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /* 배열은 크기가 고정. 크기 변경이 안 된다.
    크기 변경해서 사용하고 싶으면 새로운 배열을 만들어서 복사도 하고
    값도 넣고 써야했다.

     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("하하");
        list.add("후후");
        list.add("크크");
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(11);
        list2.add(12);
        System.out.println(list2);
    }
}
