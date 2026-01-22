package starcraft;

public class StarMain2 {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        System.out.println(t1.toString());

        Tank t2 = new Tank();
        System.out.println(t2);
        Tank t3 = new Tank();
        System.out.println(t3);
        Tank t4 = new Tank();
        Marine m1 = new Marine();
        System.out.println(m1);
        Marine m2 = new Marine();
        System.out.println(m2);
        Marine m3 = new Marine();
        Marine m4 = new Marine();
        Marine m5 = new Marine();

        Dropship dropship = new Dropship();
        dropship.check();
    }
}
