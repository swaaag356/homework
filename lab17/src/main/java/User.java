import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String login;
    private String password;
    private Role role;

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
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
            throw new WrongPasswordException("Password должен содержать не менее 20 символов: латинскиx букв прописных и строчных, цифр и символов @ . _ -");
        }

        for (int i = 0; i < users.length; ++i) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)) {
                return users[i].getRole();
            }
        }
        return null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}