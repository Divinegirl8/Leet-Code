import java.util.Arrays;
import java.util.Objects;

public class ReverseWord {
    public String reverseWords(String s) {
        String build = "";
        String[] value = convertToArray(s);

        for (int index = value.length-1; index >= 0; index--) {
            if (!Objects.equals(value[index], "")) {
                build += value[index];
            }
            build += " ";
        }
        return removeExtraSpaces(build.trim());

    }

    public static  String[] convertToArray(String s){
        return s.trim().split(" ");
    }

    public static String removeExtraSpaces(String s) {
        return s.replaceAll("\\s{2,}", " ");
    }



}


