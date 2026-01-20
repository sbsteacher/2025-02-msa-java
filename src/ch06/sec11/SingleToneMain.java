package ch06.sec11;

public class SingleToneMain {
    public static void main(String[] args) {
        SingleTone st = SingleTone.getInstance();
        SingleTone st2 = SingleTone.getInstance();

        System.out.println(st == st2);
    }
}
