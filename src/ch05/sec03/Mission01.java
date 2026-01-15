package ch05.sec03;

public class Mission01 {
    public static void main(String[] args) {
        String fileNm = "abc12-jjaswer2wdfdklfsdajflk-bbb.kkk.jpeg";

        //유연하게 코드짜셔야 한다.
        //확장자명 알고 싶다. 콘솔에 확장자명을 출력한다.
        int lastDotIdx = fileNm.lastIndexOf(".");
        String ext = fileNm.substring(lastDotIdx + 1);
        System.out.println("ext: " + ext);

        System.out.println(fileNm.substring(fileNm.lastIndexOf(".") + 1));
    }
}
