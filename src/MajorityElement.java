public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count;
        int max = 0;
        int value = 0;
        for(int index = 0; index < nums.length; index++){
             count = 0;
            for (int temp = 0; temp < nums.length; temp++) {
                if (nums[index] == nums[temp]){
                    count++;
                }

                if (count > value){
                    max = nums[index];
                }
                value = count;

            }

        }
    return max;
    }

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{6,5,5}));
        System.out.println(new MajorityElement().majorityElement(new int[]{2,2,1,1,1,2,2,1,1}));
    }
}
