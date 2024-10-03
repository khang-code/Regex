package Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^([a-z]|[A-Z]|[0-9]){6,20}+@(gmail)+(\\.(com))$";
//^([a-z]|[A-Z]|[0-9]){6,20}+\@+(gmail)+\.+(com)$
    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}