package ch13.sec03;

import java.util.List;

public class GenericExample {

    public static <T> String change(T param) {
        return "";
    }

    public static <T> T change2(List<T> param) {
        return param.get(0);
    }

    public static void main(String[] args) {
        String a = change(10);
        String b = change(10.1);
        String c = change("dd");
    }
}
