package ch06.sec11;

import java.util.Scanner;

public class KoreanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Korean k1 = new Korean("990124-4112233", "김미정");
        k1.name = "김미향";
        //k1.ssn = "121212"; //상수는 변경할 수 없다.
        System.out.printf("nation: %s, ssn: %s, name: %s\n"
                , k1.nation, k1.ssn, k1.name);

    }
}
