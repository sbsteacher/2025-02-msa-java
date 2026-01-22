package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("스마트 TV 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 TV 끈다");
    }

    @Override
    public void search(String url) {
        System.out.printf("%s를 검색합니다.\n", url);
    }
}
