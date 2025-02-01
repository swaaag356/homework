import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        double n = in.nextInt();
        double sqrt_n = 0;
        for (double i = 1; i > 0.0000001; i /= 10) {
            while (true) {
                if (sqrt_n * sqrt_n == n) {
                    System.out.printf("%.6f\n", sqrt_n);
                    System.exit(0);
                } else if (sqrt_n * sqrt_n > n) {
                    sqrt_n -= i;
                    break;
                } else {
                    sqrt_n += i;
                }
            }
        }
        System.out.printf("%.6f\n", sqrt_n);
    }
}