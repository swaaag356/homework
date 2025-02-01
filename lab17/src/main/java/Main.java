import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User admin1 = new User("sashaKrutoyPeretc228@gmail.com", "sdvhvsdkjhv123", Role.ADMIN);
        User user1 = new User("sashaNeKrutoeYabloko1996@gmail.com", "iOSUser1996", Role.USER);
        User user2 = new User("sashaNeKrutayaTikva123@gmail.com", "shushushu123", Role.USER);
        User[] users = new User[]{admin1, user1, user2};
        while (true) {
            try {
                System.out.println("Введите логин (должен содержать не менее 20 символов: латинские буквы, цифры и символов (@ . _ -) )");
                String login = scanner.nextLine();
                System.out.println("Введите пароль из не менее 8 символов: латинские буквы, цифры и символы {}[](),.;&?!_-+");
                String password = scanner.nextLine();
                Role role = userCheck(login, password, users);
                if (login.equals("exit")) {
                    System.exit(0);
                }
                if (role == null) {
                    throw new RuntimeException("Неправильный логин или пароль. Попробуйте ещё раз");
                }
                if (role == Role.ADMIN) {
                    System.out.println("ADMIN's Menu:" + "\n 1) File" + "\n 2) Create new User" + "\n 3) Exit");
                    break;
                } else if (role == Role.USER) {
                    System.out.println("ADMIN's Menu:" + "\n 1) File" + "\n 2) Get play list" + "\n 3) Exit");
                    break;
                }

            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());

            }
        }
    }
    public static Role userCheck (String login, String password, User[]users) throws
            WrongLoginException, WrongPasswordException {
        Pattern patternLogin = Pattern.compile("^(?=.{20,}$)[a-zA-Z0-9@._-]+$");
        Pattern patternPassword = Pattern.compile("^(?=.{8,}$)[a-zA-Z0-9{}\\[\\]();.,;&?!_+\\-]+$");

        Matcher matcherLogin = patternLogin.matcher(login);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (!matcherLogin.find()) {
            throw new WrongLoginException("Login должен содержать не менее 8 символов: латинские буквы, цифры и {}[](),.;&?!_-+");
        }

        if (!matcherPassword.find()) {
            throw new WrongPasswordException("PasswordsashaKrutoyPeretc228@gmail.com должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
        }

        for (int i = 0; i < users.length; ++i) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                return users[i].getRole();
            }
        }
        return null;
    }
}
