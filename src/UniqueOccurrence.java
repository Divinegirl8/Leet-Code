import java.util.*;

public class UniqueOccurrence {
    public boolean uniqueOccurrence(int[] arr){
        Map<Integer,Integer> values = new HashMap<>();

        for (int num : arr){
            values.put(num,values.getOrDefault(num,0)+1);
        }
        System.out.println(values);
     return checkValue(values);
    }

    public static boolean checkValue(Map<Integer,Integer> value){
      Set<Integer> element = new HashSet<>(value.values());
        System.out.println(element);

      return element.size() == value.size();
    }
}
