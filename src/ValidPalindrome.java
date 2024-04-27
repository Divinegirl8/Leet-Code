import java.util.Arrays;
import java.util.Objects;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.equals(" ")){
            return true;
        }

     String[] word = s.trim().split("[^a-zA-Z0-9]");

     String value = "";

        for (String string : word) {
            if (!Objects.equals(string, " ")) {
                value += string;
            }
        }


       String compare = new StringBuilder(value).reverse().toString();


        return value.equalsIgnoreCase(compare);
    }



  }

