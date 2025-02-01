import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = in.nextInt();
        int num = 0;
        int k = 0;
        System.out.println("Введите n чисел:");
        for (int i = 0; i < n; i++) {
            num = in.nextInt();
            if (IsRight(num)) {
                k++;
            }
        }
        if (k == 3) {
            System.out.println("Существует ровно три числа, в котором цифры идут по убыванию");
        } else {
            System.out.println("Не существует ровно три числа, в котором цифры идут по убыванию");
        }
    }

    public static boolean IsRight(Integer x) {
        String[] s = ("" + x).split("");
        for (int i = 1; i < s.length; i++) {
            if (Integer.parseInt(s[i]) >= Integer.parseInt(s[i - 1])) {
                return false;
            }
        }
        return true;
    }
}