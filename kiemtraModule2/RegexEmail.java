package kiemtraModule2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static final String str = "^[a-z A-Z 0-9]+[a-z A-Z 0-9]*@[a-z A-Z 0-9]+\\.[a-z A-Z 0-9]+$";

    public static boolean check(String regex) {
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
