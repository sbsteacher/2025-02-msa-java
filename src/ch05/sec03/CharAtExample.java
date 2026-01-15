package ch05.sec03;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-4230123";
        int len = ssn.length();
        System.out.println("len: " + len);

        System.out.printf("%d - %c", (int)'1', '1');

        char gender = ssn.charAt(7);
        //2, 4 여자  1, 3 남자 콘솔 출력
        if(gender == '2' || gender == '4') {
            System.out.println("여자");
        } else if(gender == '1' || gender == '3') {
            System.out.println("남자");
        } else {
            System.out.println("다시 확인해 주세요.");
        }
//        switch(gender) {
//            case '2': case '4':
//                System.out.println("여자");
//                break;
//            case '1': case '3':
//                System.out.println("남자");
//                break;
//            default:
//                System.out.println("다시 확인해 주세요.");
//        }


    }
}
