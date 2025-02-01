import java.lang.Math;

public class Task9 {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < args.length; i++) {
            x1 += Integer.parseInt(args[i]) * (int) (Math.pow(10, i));
            x2 += (Integer.parseInt(args[i]) * (int) (Math.pow(10, args.length - 1 - i)));
        }
    }
}