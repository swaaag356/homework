import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = in.nextInt();
        String[] s = new String[n];
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            s[i] = in2.nextLine();
        }
        System.out.println("Введите подстроку:");
        String s1 = in2.nextLine();
        for (int i = 0; i < s.length; i++) {
            if (s[i].toLowerCase().contains(s1.toLowerCase())) {
                System.out.println(i);
            }
        }

    }
}