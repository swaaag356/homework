public class GameMain {
    public static void main(String[] args) {

        Pillager p1 = new Pillager("John", 14);
        ZombieBull p2 = new ZombieBull("Jeb", 8);

        p1.printInfo();
        p2.printInfo();

        p1.attack(p2);
        p2.printInfo();
    }
}
