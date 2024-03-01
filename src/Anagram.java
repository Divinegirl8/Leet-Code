import java.util.*;

public class Anagram {


    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();


        for (String value : strs){
            char[] newValue = value.toCharArray();
            Arrays.sort(newValue);
            String result = new String(newValue);

            if (!map.containsKey(result)){
                map.put(result,new ArrayList<>());

            }
            map.get(result).add(value);

        }


return new ArrayList<>(map.values());

    }





}
