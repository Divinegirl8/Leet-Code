import java.util.ArrayList;
import  java.util.Arrays;

public class MoveZeros {
    public void moveZeros(int[] nums){
        int[] newNum = new int[nums.length];
        int count =0;
        for (int num : nums) {
            if (num != 0) {
                newNum[count] = num;
                count++;
            }
        }

        System.arraycopy(newNum, 0, nums, 0, nums.length);


        System.out.print(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        new MoveZeros().moveZeros(new int[]{0,13,12});
    }
}
