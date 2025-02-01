import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainText {
    public static void main(String[] args) throws FileNotFoundException {
        Pattern[] patterns = {
                Pattern.compile("(^|\\s)(я|мне|моё)(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE),
                Pattern.compile("(^|\\s)мор(е|я|ем|ями|ю|ей)(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE),
                Pattern.compile("(^|\\s)муза(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
                Pattern.compile("(^|\\s)любовь(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE),
                Pattern.compile("(^|\\s)друзья(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE),
                Pattern.compile("(^|\\s)поэт(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE),
                Pattern.compile("(^|\\s)ветры.*?веют(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
                Pattern.compile("(^|\\s)взор.*?(вс)?тревожит(\\s|$|\\.|,|!)", Pattern.CASE_INSENSITIVE | Pattern.DOTALL),
        };

        Scanner scanner;

        int countsLine = 0;
        for (int i = 0; i < patterns.length; i++){
            scanner = new Scanner(new File("C:\\java\\Home\\regexp\\src\\main\\java\\pushkin.txt"));
            int counts = 0;
            while (scanner.hasNextLine() && counts < 5){
                countsLine++;
                String line = scanner.nextLine().toLowerCase(Locale.ROOT);
                Matcher matcher = patterns[i].matcher(line);
                if (matcher.find()){
                    counts++;
                    System.out.print(countsLine + " ");
                    ColoredPrint.print(line, matcher.start(), matcher.end());
                }
            }
            System.out.println();
        }
    }
}