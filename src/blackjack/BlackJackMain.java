package blackjack;

public class BlackJackMain {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();

        gamer.receiveCard(cd.draw());
        gamer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());

        System.out.println("-- 게이머 받은 카드들 --");
        for(Card c : gamer.openCard()) { //향상된 for문
            System.out.println(c);
        }
        Card[] gamerCards = gamer.openCard();
        for(int i=0; i<gamerCards.length; i++) {
            Card c = gamerCards[i];
            System.out.println(c);
        }
        System.out.println("-- 딜러 받은 카드들 --");
        for(Card c : dealer.openCard()) {
            System.out.println(c);
        }

        dealer.needMoreCard();
    }
}
