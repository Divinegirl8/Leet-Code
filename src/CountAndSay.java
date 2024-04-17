import java.util.*;

public class CountAndSay {
    public static ArrayList<String> convertToArray(String value){
        ArrayList<String> newValue = new ArrayList<>();

        for (int index = 0; index < value.length(); index++) {
            newValue.add(String.valueOf(value.charAt(index)));
        }
     return newValue;
    }

    public static Map<Integer,Integer> countOccurringNumber(ArrayList<String> values){
        Map<Integer, Integer> map = new HashMap<>();

        for (String value : values){
            int digit = Integer.parseInt(value);
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        return map;
    }

    public static ArrayList<Integer> convertMapToArrayList(Map<Integer,Integer> values){
        ArrayList<Integer> result = new ArrayList<>();



        for (Map.Entry<Integer,Integer> value : values.entrySet()){
            result.add(value.getValue());
            result.add(value.getKey());
        }
        return result;
    }




    public static void main(String[] args) {
        String sValue = "1";
        ArrayList<String> value = convertToArray(sValue);

        Map<Integer, Integer> map = countOccurringNumber(value);

        ArrayList<Integer> digitCounts = convertMapToArrayList(map);



        System.out.println(digitCounts);
    }
}





