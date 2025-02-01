import java.util.InputMismatchException;

public class TestException {
    public static void main(String[] args) {


        double num = 0;
        boolean flag = true;

        while (flag) {

            try {
//                num = InputModule.input();
                flag = false;

//                num = 1 / (int) num;

            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод, повторите");
            } catch (ArithmeticException e) {
                System.out.println("Введите отличное от 0 значение");
                flag = true;
//            } catch () {
//                System.out.println("Число должно быть позитивным");
//                flag = true;
//            }
        }


        System.out.println(num);

    }
}}
