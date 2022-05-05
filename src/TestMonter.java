public class TestMonter {
    public static void main(String[] args) {

        Monter m1 = new FireMonster("r2u2");
        Monter m2 = new WaterMonter("u2r2");
        Monter m3 = new StoneMonter("r2r2");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonter("a2b2");
        System.out.println(m1.attack());
        Monter m4 = new Monter("u2u2");
        System.out.println(m4.attack());

    }
}
