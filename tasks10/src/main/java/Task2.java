import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите k:");
        int k = in.nextInt();
        System.out.println("Введите m:");
        int m = in.nextInt();
        int q = 0;
        for (int i = k + 1; i <= k + 3; ++i) {
            if (i % 3 == 0) {
                q = i;
                break;
            }
        }
        for (int i = q; i < m; i += 3) {
            System.out.print(i + " ");
        }
    }
}