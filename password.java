import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    public static boolean
    isValidPassword(String password)
    {

        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
    public static void main(String args[]) {

        // Test Case 1:
        String str1 = "9827350547ard";
        System.out.println(isValidPassword(str1));

        // Test Case 2:
        String str2 = "6464554653rty";
        System.out.println(isValidPassword(str2));
    }


    }


