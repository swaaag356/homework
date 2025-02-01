public class Test {
    public static void main(String[] args) {
        Integer i = 10;

        Integer a = 10;
        Integer b = 20;
        int c = a + b; //распаковка

        Integer d = c * 20;  //упаковка

        System.out.println(d);
    }

    public static Integer func1 (int a) {
        return a + 1;
    }

    public static Integer func2 (Integer a) {
        return a-1;
    }

    public static int func3(int a) {
        return a + 1;
    }
}
