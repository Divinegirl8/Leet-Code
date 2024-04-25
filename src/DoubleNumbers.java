import java.util.Arrays;

public class DoubleNumbers {
    public static  int[] doubleArray(int[] numbers){
        int[] nums = new int[numbers.length * 2];


        for (int index = 0; index < numbers.length;index++) {
            nums[index] = numbers[index];
            int doubleNums = numbers[index] * 2;


            nums[numbers.length + index] = doubleNums;



        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleArray(new int[]{4, 5, 8})));
    }
}
