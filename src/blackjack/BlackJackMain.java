package blackjack;

public class BlackJackMain {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        System.out.println(c1.getDenomination() + '-' + c1.getPattern());
        Card c2 = cd.draw();
    }
}
