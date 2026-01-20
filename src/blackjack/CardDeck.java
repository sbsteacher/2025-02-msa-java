package blackjack;

// CardDeck을 기본생성자로 호출만 하여도
// Card객체 52개를 생성하여 cards가 가리키는
// 배열에 순차적으로 저장(대입)한다.
// 가능하면 무늬별로 다른 denomination값이
// 저장되었으면 한다.
public class CardDeck {
    //Card 객체 주소값 52개를 담을 수 있어야 합니다.
    private Card[] cards = new Card[52];
    private String[] patterns = { "스페이드", "하트", "클로버", "다이아" };

    public CardDeck() {
        init();
    }

    private void init() {
        int idx = 0;
        for(int i=0; i<patterns.length; i++) {
            String pattern = patterns[i];
            for(int d=1; d<=13; d++) {
                String denomination = String.valueOf(d); //정수 > 문자열
                switch(d) {
                    case 1: denomination = "A"; break;
                    case 11: denomination = "J"; break;
                    case 12: denomination = "Q"; break;
                    case 13: denomination = "K"; break;
                }
                Card c = new Card(pattern, denomination);
                cards[idx++] = c;
            }
        }
        for(Card c : cards) {
            System.out.printf("%s - %s\n", c.getPattern(), c.getDenomination());
        }
    }
}
