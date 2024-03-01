import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result =  new int[2];

        for (int index = 0,count =0; index < nums.length; index++) {
            for (int index2 = 0; index2 < index; index2++) {
                int sum = nums[index] + nums[index2];
                if (sum == target){
                    result[count++] = index2;
                    result[count++] = index;
                }
            }


        }
        return result;
    }


}
