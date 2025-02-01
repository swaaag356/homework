import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите х (в формате double)");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(); // значение x, для которого вычисляем sin(x)
        double precision = 1e-9; // требуемая точность

        double result = 0; // результат вычисления
        double term = x; // текущий член ряда
        int n = 1; // номер текущего члена ряда

        while (Math.abs(term) > precision) {
            result += term;
            term *= -x * x / ((2 * n) * (2 * n + 1));
            n++;
        }

        System.out.println("sin(" + x + ") = " + result);
    }
}