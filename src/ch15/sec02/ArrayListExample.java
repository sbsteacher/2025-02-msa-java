package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    /* 배열은 크기가 고정. 크기 변경이 안 된다.
    크기 변경해서 사용하고 싶으면 새로운 배열을 만들어서 복사도 하고
    값도 넣고 써야했다.

    한 곳에 여러값을 담을 수 있는 친구들을 Collection이라고 한다.
    배열, ArrayList, LinkedList, HashMap, Set 등등

     */
    public static void main(String[] args) {
        //List<String> 나 유연한 배열인데 각 방은 String이야.
        List<String> list = new ArrayList<>();
        //list.add(10);
        list.add("하하");
        list.add("후후");
        list.add("크크");
        list.add("크크");

        String str1 = list.get(0);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);

        //질문1, List, ArrayList   >>  상속관계
        //질문2, List 부모타입
        //3. List  >>   interface
        //Wrapper 클래스 : primitive타입의 클래스형
        List<Integer> list2 = new ArrayList<>();
        //list2.add("하하");
        list2.add(10);
        list2.add(11);
        list2.add(12);
        int int1 = list2.get(0);
        System.out.println(list2);
    }
}
