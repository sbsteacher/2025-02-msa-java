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
        System.out.println("m5: " + m5);

        Dropship dropship = new Dropship();
        dropship.load(t1);
        dropship.load(t2);
        dropship.load(t3);
        dropship.load(t4);
        dropship.load(m1);
        dropship.load(m2);
        dropship.load(m3);
        dropship.load(m4);
        dropship.load(m5);
        dropship.check();

        System.out.println("-----------");
        Unit u1 = dropship.unload2(2);
        System.out.println("u1: " + u1);
        dropship.check();

        System.out.println("-----------");
        Unit u2 = dropship.unload2(2);
        System.out.println("u2: " + u2);
        dropship.check();

        System.out.println("-----------");
        Unit u3 = dropship.unload2(5);
        System.out.println("u3: " + u3);
        dropship.check();

        System.out.println("-----------");
        dropship.load(u3);
        dropship.check();

        System.out.println("-----------");
        Unit u4 = dropship.unload2(5);
        System.out.println("u4: " + u4);
        dropship.check();
    }
}
