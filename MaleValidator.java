import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaleValidator {
    public static boolean isValidMale(String str) {
        return str.equals("f") || str.equals("m");
    }
}
