package kiemtraModule2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexphone {
    public static final String phone = "^[0]\\d{9}$";

    public static boolean check(String regex) {
        Pattern pattern = Pattern.compile(phone);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
