public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        // System.out.println(f.currentFood);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);

        System.out.println(Math.random());
        // double random = Math.random() * 10;
        // System.out.println(random);
        int random = (int) (Math.random() * 50 + 1);
        System.out.println(random);
        System.out.println(Math.random() < 0.05);

        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
        
    }
}