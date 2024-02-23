
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator {


    public static boolean isValidDate(String date) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);

        return matcher.matches();
    }
}