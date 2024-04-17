public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        String newValue = "";

        for (int index = value.length()-1; index >= 0 ; index--) {
            newValue += value.charAt(index);
        }
       return newValue.equals(value);
    }


}
