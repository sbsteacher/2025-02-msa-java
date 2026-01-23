package ch13.sec01;

public class ProductMain {
    public static void main(String[] args) {
        Product<Tv, String> p1 = new Product<>();
        p1.setKind(new Tv());
        p1.setModel("스마트TV");

        Product<Car, Integer> p2 = new Product<>();
        p2.setKind(new Car());
        p2.setModel(5);
    }
}
