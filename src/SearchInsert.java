public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int value = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target){
                value = index;
            } else if (nums[index] < target) {
                value = index + 1;

            }
        }
        return value;

    }

    public static void main(String[] args) {
        System.out.println(new SearchInsert().searchInsert(new int[]{1,3,5,6},7));
    }
}
