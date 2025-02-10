public class Test {
    public static void main(String[] args) {
        LeftIntegralCulc calculateIntegralLeft = new LeftIntegralCulc(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralLeft.get());

        System.out.println("-------------");

        MiddleIntegralCulc calculateIntegralMiddle = new MiddleIntegralCulc(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralMiddle.get());

        System.out.println("-------------");

        RightIntegralCulc calculateIntegralRight = new RightIntegralCulc(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralRight.get());

        System.out.println("-------------");

        TrapetionIntegralCulc calculateIntegralTrapezium = new TrapetionIntegralCulc(0, Math.PI, new Sinus());
        System.out.println(calculateIntegralTrapezium.get());
    }
}
