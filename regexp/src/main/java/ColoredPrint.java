public class ColoredPrint {

    private static String RESET = "\u001B[0m";
    private static String GREEN = "\u001B[38;2;0;255;0m";

    public static void print(String s, int start, int end) {
        System.out.print(s.substring(0, start));
        System.out.print(GREEN);
        System.out.print(s.substring(start, end));
        System.out.print(RESET);
        System.out.println(s.substring(end));
    }
}