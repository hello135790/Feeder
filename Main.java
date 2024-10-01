public class Main
{
    public static void main(String[] args)
    {
        // Feeder f = new Feeder();
        // System.out.println(f); // f@
        // // System.out.println(f.currentFood);
        // System.out.println(f.getCurrentFood()); // int prints 0
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood()); // prints amount of food

        // System.out.println(Math.random());
        // // double random = Math.random() * 10;
        // // System.out.println(random);
        // int random = (int) (Math.random() * 50 + 1); // moves decimal point, adds 1 so not zero//
        // System.out.println(random);
        // System.out.println(Math.random() < 0.05); // boolean

        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood()); 

        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);

        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4));

        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5, 10));

        Feeder l = new Feeder(250);
        System.out.println(l.simulateManyDays(10, 5));
    }
}