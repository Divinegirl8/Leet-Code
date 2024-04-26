import java.util.ArrayList;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        ArrayList<Integer> value = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val){
                value.add(nums[index]);
            }
        }
        return value.size();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
