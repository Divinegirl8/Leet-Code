public class SingleNumberII {
    public int singleNumber(int[] nums) {
        int find = 0;

        for(int index = 0; index < nums.length; index++){
            int count = 0;
            for(int temp = 0; temp < nums.length; temp++){
                if(nums[index] == nums[temp]) count++;
            }

            if(count == 1){
                find = nums[index];
            }
        }
        return find;
    }

}
