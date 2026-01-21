package blackjack;

public class Gamer {
    //게이머는 카드 객체 주소값 52개를 저장할 수 있다.
    protected final String name;
    protected Card[] cards = new Card[52];
    private int receiveIdx = 0;

    public Gamer() {
        this("게이머");
    }

    protected Gamer(String name) {
        this.name = name;
    }

    public void receiveCard(Card card) {
        cards[receiveIdx++] = card;
    }

    public Card[] openCard() {
        //null이 없는 새로운 Card 배열을 만들어서 리턴
        Card[] temp = new Card[receiveIdx];
        for(int i=0; i<temp.length; i++) {
            temp[i] = cards[i];
        }
        return temp;
    }

    public void showYourCards() {
        System.out.printf("----- %s -----\n", this.name);
        for(Card c : openCard()) {
            System.out.println(c);
        }
    }
}
