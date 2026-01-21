package blackjack;

public class Rule {
    private final static int BLACKJACK_SCORE = 21;
    //2~10은 숫자 그대로 점수를, K/Q/J는 10점으로, A는 1로 계산
    //카드들의 모든 점수를 더하고 더한 점수를 리턴하시오.
    public static int calcScore(Card[] cards) {
        int totalScore = 0;
        for(Card card : cards) {
            String denomination = card.getDenomination();
            //switch 표현식
            int score = switch(denomination) {
                case "A" -> 1;
                case "J", "Q", "K" -> 10;
                default -> Integer.parseInt(denomination);
            };
            totalScore += score;
        }
        return totalScore;
    }

    public static void whoIsWinner(Dealer dealer, Gamer gamer) {
        Card[] dealerCards = dealer.openCard();
        Card[] gamerCards = gamer.openCard();
        int dealerScore = calcScore(dealerCards);
        int gamerScore = calcScore(gamerCards);

        if(dealerScore == gamerScore || dealerScore > BLACKJACK_SCORE && gamerScore > BLACKJACK_SCORE) {
            System.out.println("무승부");
        } else if(dealerScore > BLACKJACK_SCORE || gamerScore <= BLACKJACK_SCORE && dealerScore <= BLACKJACK_SCORE && gamerScore > dealerScore) {
            System.out.println("게이머 승");
        } else {
            System.out.println("딜러 승");
        }
    }
}
