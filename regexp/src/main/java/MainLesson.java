import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainLesson {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(J|j).*ava", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("I love java");

        System.out.println(matcher.find());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        System.out.println();

    }
}

