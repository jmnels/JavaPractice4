package regExExamle;

import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args) {
        String emailRegEx = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegEx);
        String josh = "josh@gmail.com";
        System.out.println(pattern.matcher(josh).matches());
    }
}
