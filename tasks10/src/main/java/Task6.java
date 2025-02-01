import java.util.Scanner;
import java.lang.Math;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a (в формате Double):");
        Double a = in.nextDouble();
        System.out.println("Введите b (в формате Double):");
        Double b = in.nextDouble();
        System.out.println("Введите c (в формате Double):");
        Double c = in.nextDouble();
        Double D = b * b - 4 * a * c;
        if (D > 0) {
            System.out.println("X1 = " + ((-b + Math.sqrt(D)) / (2 * a)));
            System.out.println("X2 = " + ((-b - Math.sqrt(D)) / (2 * a)));
        } else if (D == 0) {
            System.out.println("X1 = X2 = " + ((-b) / (2 * a)));
        } else {
            System.out.println("Корней нет!");
        }
    }
}