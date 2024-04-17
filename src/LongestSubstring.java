import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty())
            return 0;

        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charIndexMap.containsKey(c)) {
                start = Math.max(start, charIndexMap.get(c) + 1);
            }
            charIndexMap.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "pwwkew";
        String s3 = "bbbbbb";

        System.out.println("Length of the longest substring without repeating characters in 'abcabcbb': " + lengthOfLongestSubstring(s1));
        System.out.println("Length of the longest substring without repeating characters in 'pwwkew': " + lengthOfLongestSubstring(s2));
        System.out.println("Length of the longest substring without repeating characters in 'pwwkew': " + lengthOfLongestSubstring(s3));
    }
}
