package ch08.sec11;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //Vehicle들도 객체화
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
        //driver.drive("택시");
    }
}
