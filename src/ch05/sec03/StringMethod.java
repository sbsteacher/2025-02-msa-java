package ch05.sec03;

public class StringMethod {
    public static void main(String[] args) {
        //문자열 부분 변경
        String oldStr = "자바 프로그래밍 자바";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println("oldStr: " + oldStr);
        System.out.println("newStr: " + newStr);

        String oldStr2 = "ㅞㅏㄱ가나다라1마바사2ABCD4";
        String newStr2 = oldStr2.replaceAll("\\d", "");
        String newStr3 = oldStr2.replaceAll("[ㅏ-ㅣㄱ-ㅎ가-힣a-zA-Z]", "");
        System.out.println("oldStr2: " + oldStr2);
        System.out.println("newStr2: " + newStr2);
        System.out.println("newStr3: " + newStr3);

        //간단미션, oldStr4의 모든 빈칸(스페이스) 없앤 새로운 문자열을 만들어 주세요.
        String oldStr4 = "안녕 하 세요. 반가워요. 저는, 홍 길동 입니다.";
        String newStr4 = oldStr4.replace(" ", "")
                                .replace(".", "")
                                .replace(",", "");
        String newStr4_1 = oldStr4.replaceAll("[ ,.]", "");
        System.out.println("oldStr4: " + oldStr4);
        System.out.println("newStr4: " + newStr4);
        System.out.println("newStr4_1: " + newStr4_1);

    }
}
