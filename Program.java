package home001;

public class Program {
    public static void main(String[] args) {
        Product molochko = new Milk("moloko", 1.3, 1, "pack", 0.9, "10.04.2023", 2.4); 
        Product hlebushek = new Bread("hleb", 0.5, 1, "pieces", "01.04.2023", "rye");
        Product iichko = new Egg("iichko", 1.1, 1, "pack", "20.04.2023", 10);
        Product buratino = new Lemonade("buratino", 1.5, 1, "bottle", 1.5);
        Product maski = new Mask("maski", 0.1, 1, "pack", 10);
        Product zewa = new Paper("zewa", 2.0, 1, "pack", 8, 2);
        Product soska = new Pacifier("soska", 2.0, 1, "pack", 0, false);
        Product pampers = new Diapers("pampers", 2.0, 1, "pack", 0, true, 0, 3, 6, "pants");

        System.out.println(molochko);
        System.out.println(hlebushek);
        System.out.println(iichko);
        System.out.println(buratino);
        System.out.println(maski);
        System.out.println(zewa);
        System.out.println(soska);
        System.out.println(pampers);
    }
}
