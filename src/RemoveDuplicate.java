import java.util.ArrayList;

public class RemoveDuplicate {

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> newValue = new ArrayList<>();

        for (int num : nums){
            if (!(newValue.contains(num))){
                newValue.add(num);
            }
        }
        return newValue.size();
    }
}
