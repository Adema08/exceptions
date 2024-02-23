import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitValidator {

    public static boolean isValidNumber(String str) {
        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
