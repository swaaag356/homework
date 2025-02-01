import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int high = 1; high <= n; ++high) {
            for (int i = 0; i < n * 2 - high; ++i) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * high - 1; ++i) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int high = 1; high <= n; ++high) {
            for (int cnt = 1; cnt <= 2; ++cnt) {
                for (int i = 0; i < n - high; ++i) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= 2 * high - 1; ++i) {
                    System.out.print("*");
                }
                if (cnt == 1) {
                    for (int i = 0; i < n - high + 1; ++i) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}