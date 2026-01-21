package blackjack;

public class Card {
    //무늬 pattern (스페이드, 하트, 클로버, 다이아 중 한 값)
    //숫자 denomination (A, 2~10, J, Q, K 중 한 값을 담을 수 있어야 한다.)
    // 무늬, 숫자 값 하나씩 저장할 수 있는 카드 클래스를 만들어 주세요. 단, 객체 생성 이후 변경은 불가능
    private String pattern;
    private String denomination;

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    //getters 생성
    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return String.format("Card - %s(%s)", pattern, denomination);
    }
}
