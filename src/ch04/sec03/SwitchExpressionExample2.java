package ch04.sec03;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String grade = "NORMAL"; //VIP, GOLD, NORMAL
        /* 등급별 할인 가격
        VIP는 가격에 10% 할인 가격  >> 1000
        GOLD는 가격에 5% 할인 가격  >> 500
        NORMAL는 원래 가격  >> 0
        */
        int price = 10_000; //제품 가격

        int buyPrice = switch(grade) {
            case "VIP" -> {
                double discount = 0.1;
                yield (int)(price * discount);
            }
            case "GOLD" -> (int)(price * 0.05);
            default -> 0;
        };

        System.out.println("buyPrice: " + buyPrice);
    }
}
