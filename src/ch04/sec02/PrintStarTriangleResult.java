package ch04.sec02;

public class PrintStarTriangleResult {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; //3~6랜덤값
        System.out.println("star: " + star);

        for(int i=0; i<star; i++) {
            for(int z=0; z<=i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
